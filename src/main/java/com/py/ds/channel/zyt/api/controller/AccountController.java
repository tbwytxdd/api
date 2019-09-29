package com.py.ds.channel.zyt.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.py.ds.channel.zyt.api.service.AccountService;
import com.py.ds.channel.zyt.api.xmlmodel.FOAReq;
import com.py.ds.channel.zyt.api.xmlmodel.FOARes;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags="账户类相关")
@RequestMapping("/account")
@RestController
public class AccountController {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private AccountService accountService;

	@ApiOperation(value="开户申请")
    @PostMapping(value = "/open", consumes = { MediaType.APPLICATION_XML_VALUE }, produces = MediaType.APPLICATION_XML_VALUE)
    public FOARes test(@RequestBody FOAReq foaReq){
        return accountService.openAccount(foaReq);
    }
	
	@ApiOperation(value="开户资料文件上传(影音文件上传)")
    @PostMapping(value = "/upload", consumes = { MediaType.APPLICATION_XML_VALUE }, produces = MediaType.APPLICATION_XML_VALUE)
    public FOARes upload(@RequestBody FOAReq foaReq){
        return new FOARes();
    }
	
	@ApiOperation(value="客户资料修改")
    @PostMapping(value = "/modify", consumes = { MediaType.APPLICATION_XML_VALUE }, produces = MediaType.APPLICATION_XML_VALUE)
    public FOARes modify(@RequestBody FOAReq foaReq){
        return new FOARes();
    }
	
	@ApiOperation(value="签约账户状态查询(当日开户当日交易)")
    @PostMapping(value = "/query", consumes = { MediaType.APPLICATION_XML_VALUE }, produces = MediaType.APPLICATION_XML_VALUE)
    public FOARes query(@RequestBody FOAReq foaReq){
        return new FOARes();
    }
	
	@ApiOperation(value="CRS涉税信息收集")
    @PostMapping(value = "/crs", consumes = { MediaType.APPLICATION_XML_VALUE }, produces = MediaType.APPLICATION_XML_VALUE)
    public FOARes crs(@RequestBody FOAReq foaReq){
        return new FOARes();
    }
	
	@ApiOperation(value="受益人信息收集")
    @PostMapping(value = "/benefit", consumes = { MediaType.APPLICATION_XML_VALUE }, produces = MediaType.APPLICATION_XML_VALUE)
    public FOARes benefit(@RequestBody FOAReq foaReq){
        return new FOARes();
    }

}
