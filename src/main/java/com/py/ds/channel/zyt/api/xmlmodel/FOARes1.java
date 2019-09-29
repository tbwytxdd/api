package com.py.ds.channel.zyt.api.xmlmodel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("基金开户响应结果")
@Data
public class FOARes1 {

    @ApiModelProperty(name = "code" , value = "响应状态码")
    private String code;

    @ApiModelProperty(name = "allotNo" , value = "申请编号")
    private String allotNo;

    @ApiModelProperty(name = "applyDate" , value = "申请日期")
    private String applyDate;

    @ApiModelProperty(name = "clientId" , value = "客户编号")
    private String clientId;

    @ApiModelProperty(name = "message" , value = "返回错误信息")
    private String message;

    @ApiModelProperty(name = "taAcco" , value = "TA账号/基金账号")
    private String taAcco;

    @ApiModelProperty(name = "tradeAcco" , value = "交易账号")
    private String tradeAcco;

    public FOARes1(){}

    public FOARes1(String code, String allotNo, String applyDate, String clientId, String message, String taAcco, String tradeAcco) {
        this.code = code;
        this.allotNo = allotNo;
        this.applyDate = applyDate;
        this.clientId = clientId;
        this.message = message;
        this.taAcco = taAcco;
        this.tradeAcco = tradeAcco;
    }

    /*public FOARes1 success(){
        FOARes1 foaRes1 = new FOARes1();
        foaRes1.setCode("ETS-5BP0000");
        foaRes1.setMessage("开户成功");

        return foaRes1;
    }*/
}
