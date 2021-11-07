package com.es4a4.calculadoraColaborativa.dweet;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

public class PostDweet {
	public static boolean post(String operacao, int num1, int num2) {
		try {
			HttpClient httpClient = HttpClientBuilder.create().build(); // Use this instead
			HttpPost request = new HttpPost("http://dweet.io/dweet/for/es4a4-fgmtem?");

			// Inserindo os valores dinamicamente na URL
			StringEntity params = new StringEntity("operacao=" + operacao + "&num1=" + num1 + "&num2=" + num2);
			request.addHeader("content-type", "application/x-www-form-urlencoded");
			request.setEntity(params);
			HttpResponse response = httpClient.execute(request);

			// System.out.println(response.getAllHeaders());
			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}