package com.py.ds.channel.zyt.api.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HttpService {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private RestTemplate restTemplate;
	
	public ResponseEntity<String> postForString(String url, Map<String,String> bodyMap) throws IOException {
		HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/x-www-form-urlencoded; charset=UTF-8");  
        headers.setContentType(type);  

		List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();  
		bodyMap.forEach((k,v)->nameValuePairs.add(new BasicNameValuePair(k, bodyMap.get(k))));

        UrlEncodedFormEntity a = new UrlEncodedFormEntity(nameValuePairs, "UTF-8");
        @SuppressWarnings("resource")
    	Scanner scanner = new Scanner(a.getContent()).useDelimiter("\\Z");
    	String bodyStr = scanner.hasNext() ? scanner.next() : "";
    	HttpEntity<String> requestEntity = new HttpEntity<String>(bodyStr,headers);
    	ResponseEntity<String> res = null; 
		long startTime=System.currentTimeMillis();
    	try {
    		res = new ResponseEntity<String>(restTemplate.postForObject(url, requestEntity, String.class), HttpStatus.OK);
    		long endTime=System.currentTimeMillis();
    		log.info("执行成功消耗时间："+(float)(endTime-startTime)/1000+"s");
    	}catch(Exception e) {
    		long endTime=System.currentTimeMillis();
    		log.info("执行超时时间："+(float)(endTime-startTime)/1000+"s,Excep is "+e.getClass(),e);
    	}
    	
    	return res;
    	
    	

	}
}
