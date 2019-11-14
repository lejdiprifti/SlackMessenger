package com.transit.services;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	
	public TestService() {
		
	}
	
	public HttpEntity sendRequest(String customer, Long id) throws ClientProtocolException, IOException {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet("https://enpvwnv93hyp.x.pipedream.net/?customer="+customer+"&order="+id);
		CloseableHttpResponse response = httpclient.execute(httpget);
		return response.getEntity();
	}
	
}
