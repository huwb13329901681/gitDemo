package org.itcast.com;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpClientController {

	public static void main(String[] args) throws Exception {
		//创建httpClient请求
		CloseableHttpClient httpClient = HttpClients.createDefault();
		for (int i = 0; i < 6; i++) {
			//调用get请求访问服务
			HttpGet httpget = new HttpGet("http://localhost:9000/roll");
			//获取响应
			HttpResponse response = httpClient.execute(httpget);
			System.out.println(EntityUtils.toString(response.getEntity()));
		}
	}
}
