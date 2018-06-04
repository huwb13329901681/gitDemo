package org.itcast.com;

import java.net.URI;
import java.net.URISyntaxException;

import com.netflix.client.ClientFactory;
import com.netflix.client.http.HttpRequest;
import com.netflix.client.http.HttpResponse;
import com.netflix.config.ConfigurationManager;
import com.netflix.niws.client.http.RestClient;

public class ServerApplication {

	public static void main(String[] args) throws Exception {
		ConfigurationManager.getConfigInstance().setProperty("my-client.ribbon.listOfServers", "localhost:8080,localhost:8081,localhost:8082,localhost:8083"); 
		RestClient client = (RestClient) ClientFactory.getNamedClient("my-client");  
	    HttpRequest request = HttpRequest.newBuilder().uri(new URI("/person")).build(); 
	    for (int i = 0; i < 20; i++)  {
	      	HttpResponse response = client.executeWithLoadBalancer(request);
	      	String json = response.getEntity(String.class);
	      	System.out.println(json);
	      }
	}

}
