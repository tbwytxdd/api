package com.py.ds.channel.zyt.api.config;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.NoConnectionReuseStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig{
	
	
/*   @Value("${spring.application.name}:${server.address}:${server.port}")
    private String userAgent;
	
	public class UserAgentInterceptor implements ClientHttpRequestInterceptor {
        @Override
        public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
            HttpHeaders headers = request.getHeaders();
            headers.add(HttpHeaders.USER_AGENT, userAgent);
            return execution.execute(request, body);
        }
    }*/
	
	@Bean
	public RestTemplate restTemplate() throws KeyManagementException, NoSuchAlgorithmException, KeyStoreException{

         SSLContext sslContext = SSLContexts.custom()
        		 							.loadTrustMaterial(null, (arg0,arg1)->true)//信任任何的证书
        		 							.build();

         SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext,new String[] {"TLSv1.1" ,"TLSv1.2"},null,(urlHostName,session)->true);//信任任何的域名
         
         CloseableHttpClient httpClient = HttpClients.custom()
        		 						  .setSSLSocketFactory(csf)
        		                          .setConnectionReuseStrategy(NoConnectionReuseStrategy.INSTANCE)//不使用长连接策略
        		                          .build();

         HttpComponentsClientHttpRequestFactory requestFactory =new HttpComponentsClientHttpRequestFactory();
         requestFactory.setHttpClient(httpClient);
         requestFactory.setConnectTimeout(5000);// 设置超时 
         requestFactory.setConnectionRequestTimeout(5000);
         requestFactory.setReadTimeout(20000);
         RestTemplate restTemplate = new RestTemplate(requestFactory);

         DefaultResponseErrorHandler MyErrorHandler = new DefaultResponseErrorHandler() {	 
        	 @Override
        	 public boolean hasError(ClientHttpResponse response) throws IOException{
        		 return false;
        	 }
 
        	 @Override
        	 public void handleError(ClientHttpResponse response) throws IOException{
        		 
        	 }
         };
         
         restTemplate.setErrorHandler(MyErrorHandler);
         
         return restTemplate;
	}

}
