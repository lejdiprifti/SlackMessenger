package com.transit.services;

import java.io.IOException;
import java.util.GregorianCalendar;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.stereotype.Service;

import com.transit.model.MessageModel;

import net.minidev.json.JSONObject;

@Service
public class TestService {

	public TestService() {

	}
	/*
	 * public HttpEntity sendOrder(String customer, Long id) throws
	 * ClientProtocolException, IOException { CloseableHttpClient httpclient =
	 * HttpClients.createDefault(); HttpGet httpget = new
	 * HttpGet("https://enpvwnv93hyp.x.pipedream.net/?customer=" + customer +
	 * "&order=" + id); CloseableHttpResponse response =
	 * httpclient.execute(httpget); return response.getEntity(); }
	 */
	
	 public String sendMessageOnSlack(MessageModel message) throws
	  ClientProtocolException, IOException { 
		 CloseableHttpClient httpclient = HttpClients.createDefault(); HttpPost post = new HttpPost(
	  "https://hooks.slack.com/services/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"); 
      JSONObject json = new JSONObject(); String text = " "+
	  message.getEmerKlienti()+" opened the application "+message.getEmerKlienti()+" at "+ new
	  GregorianCalendar().getTime() + " "; json.put("text", text); try {
	  StringEntity stringEntity = new StringEntity(json.toJSONString());
	  post.addHeader("Content-Type", "application/json");
	  stringEntity.setContentType("application/json");
	  post.setEntity(stringEntity);
	  
	  return httpclient.execute(post).toString();
	  
	  } catch (Exception e) { throw new RuntimeException(e); } }
	 
}
