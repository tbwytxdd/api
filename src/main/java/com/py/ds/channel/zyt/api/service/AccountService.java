package com.py.ds.channel.zyt.api.service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.py.ds.channel.zyt.api.xmlmodel.FOARes1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import com.py.ds.channel.zyt.api.service.HttpService;
import com.py.ds.channel.zyt.api.xmlmodel.FOAReq;
import com.py.ds.channel.zyt.api.xmlmodel.FOARes;

public class AccountService {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private HttpService httpService;

	public FOARes openAccount(FOAReq foaReq){
		Map<String,String> argsMap=new HashMap<String,String>();
		String merid = "000330"; //商户号 S 30 0 Y v4.1.0.0  授权给调用方的商户号 
		String channel = "330000"; //交易渠道 S 20 0 N v4.1.0.0  FUNDAPI交易渠道 
		argsMap.put("merid", merid);
		argsMap.put("channel", channel);//要查询的关键字
    	try {
			ResponseEntity<String> result = httpService.postForString("http://IP:PORT/openapi/wmbusrestful/ds/pub/account/openfundaccount",
					argsMap);
		} catch (IOException e) {
			e.printStackTrace();
		}
        //return new FOARes();
		FOARes1 foaRes1 = new FOARes1();
    	foaRes1.setCode("");
    	return null;
	}
	

}
