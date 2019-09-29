package com.py.ds.channel.zyt.api.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.py.ds.channel.zyt.api.service.HttpService;
import com.py.ds.channel.zyt.api.xmlmodel.FOAReq;
import com.py.ds.channel.zyt.api.xmlmodel.FOARes;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags="基金交易类相关")
@RequestMapping("/account")
@RestController
public class TradeController {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private HttpService httpService;
	
	@ApiOperation(value="基金产品新增和修改")
    @PostMapping(value = "/product", consumes = { MediaType.APPLICATION_XML_VALUE }, produces = MediaType.APPLICATION_XML_VALUE)
    public FOARes upload(@RequestBody FOAReq foaReq){
        return new FOARes();
    }
	
	@ApiOperation(value="认申购申请")
    @PostMapping(value = "/subscribe", consumes = { MediaType.APPLICATION_XML_VALUE }, produces = MediaType.APPLICATION_XML_VALUE)
    public FOARes subscribe(@RequestBody FOAReq foaReq){
        return new FOARes();
    }
	
	@ApiOperation(value="查询可撤单交易")
    @PostMapping(value = "/query", consumes = { MediaType.APPLICATION_XML_VALUE }, produces = MediaType.APPLICATION_XML_VALUE)
    public FOARes query(@RequestBody FOAReq foaReq){
        return new FOARes();
    }
	
	@ApiOperation(value="撤单")
    @PostMapping(value = "/cancel", consumes = { MediaType.APPLICATION_XML_VALUE }, produces = MediaType.APPLICATION_XML_VALUE)
    public FOARes cancel(@RequestBody FOAReq foaReq){
        return new FOARes();
    }
	
	@ApiOperation(value="查询份额")
    @PostMapping(value = "/balance", consumes = { MediaType.APPLICATION_XML_VALUE }, produces = MediaType.APPLICATION_XML_VALUE)
    public FOARes balance(@RequestBody FOAReq foaReq){
        return new FOARes();
    }
	
	@ApiOperation(value="赎回")
    @PostMapping(value = "/redem", consumes = { MediaType.APPLICATION_XML_VALUE }, produces = MediaType.APPLICATION_XML_VALUE)
    public FOARes redem(@RequestBody FOAReq foaReq){
        return new FOARes();
    }
	
	@ApiOperation(value="电子合同签署")
    @PostMapping(value = "/elecCon", consumes = { MediaType.APPLICATION_XML_VALUE }, produces = MediaType.APPLICATION_XML_VALUE)
    public FOARes elecCon(@RequestBody FOAReq foaReq){
        return new FOARes();
    }
	
	@ApiOperation(value="修改分红方式")
    @PostMapping(value = "/modifyBonus", consumes = { MediaType.APPLICATION_XML_VALUE }, produces = MediaType.APPLICATION_XML_VALUE)
    public FOARes modifyBonus(@RequestBody FOAReq foaReq){
        return new FOARes();
    }

}
