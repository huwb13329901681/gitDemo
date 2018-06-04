package org.itcast.com;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpClientController {

	public static void main(String[] args) throws Exception {
		//����httpClient����
		CloseableHttpClient httpClient = HttpClients.createDefault();
		for (int i = 0; i < 6; i++) {
			//����get������ʷ���
			HttpGet httpget = new HttpGet("http://localhost:9000/roll");
			//��ȡ��Ӧ
			HttpResponse response = httpClient.execute(httpget);
			System.out.println(EntityUtils.toString(response.getEntity()));
		}
	}
}
