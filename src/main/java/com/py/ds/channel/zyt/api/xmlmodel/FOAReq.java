package com.py.ds.channel.zyt.api.xmlmodel;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class FOAReq {
	
	private String version;//版本号	version	char(7)	R	目前版本号：1.0.0
	
	private String instId;//机构标识	instId	char(10) R	报文发送方的机构标识，由基金方给银行分配

	@JacksonXmlProperty(localName = "version")
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@JacksonXmlProperty(localName = "instId")
	public String getInstId() {
		return instId;
	}

	public void setInstId(String instId) {
		this.instId = instId;
	}
	
	/*数字证书标识	certId	char(16)	O	基金端证书标识码，对报文进行签名的数字证书标识，目前可填空
	个人/机构标志	isIndividual	char (1)	R	字典：150018
	0-机构，1-个人，2-产品
	机构类型	institutionType	char(1)	R	当isindividual = 0 取字典：机构分类
	当isindividual = 2 取字典：产品分类
	产品名称	productName	char(120)	O	当isindividual = 2 填写
	产品备案时间	recordDate	char(8)	O	当isindividual = 2 填写
	备案编号	recordNo	char(64)	O	当isindividual = 2 填写
	产品备案机构	recordOrganization	char(120)	O	当isindividual = 2 填写
	投资者类别	investorCategory	char(1)	O	0:普通投资者
	1专业投资者
	银行客户ID	userId	char (16)	O	可不填
	银行签约关联号	contractNo	char (36)	R	签约关联号，银行用户与基金交易账号关联的唯一标识
	银行基金专户ID	subCardNo	char (16)	O	可不填
	是否直接开户	isRt	char (1)	R	字典：1/0。1表示无需人工审核，直接开户，0则反之。
	银行申请流水号	applicationNo	char (24)	R	
	投资人基本信息
	投资人姓名	investorName	char (120)	R	投资人姓名
	证件类型	certType	char (2)	R	见证件类型一览表
	证件号码	certificateNo	char (30)	R	
	证件有效日期	idValidDate	char (8)	R	格式为：YYYYMMDD
	风险承受能力等级	riskLevel	char (1)	R	1-保守；2-稳健；3-积极
	反洗钱风险类型	amlRisktype	char (1)	R	1-低；2-中；3-高；
	通常填1即可
	投资人资料信息
	投资人邮政编码	postCode	char (6)	R	
	投资人单位电话号码	officeTel	char (22)	O	
	投资人传真号码	fax	char (24)	O	
	投资人通讯地址（4）	address	char (120)	R	
	投资人上交所股东代码	shsecAcc	char (10)	O	投资人在交易所开立的股东代码卡账号
	投资人深交所股东代码	szsecAcc	char (10)	O	投资人在交易所开立的股东代码卡账号
	投资人银行信息
	投资人开户银行代码	bankNo	char (10)	R	见数据字典
	投资人开户银行名称	bankName	char (20)	R	银行名称，如（招商银行/工商银行）
	投资人银行账户户名	acctName	char (60)	R	
	投资人银行账户账号	acctNo	char (28)	R	
	投资人银行所在省/直辖市代码	province	char (6)	R	见数据字典
	投资人银行所在市代码	city	char (6)	R	见数据字典
	投资人银行账户分支行名称	deptInfo	char(60)	O	分支行名称,如(深圳分行)
	投资人银行账户分支行联行号	uniCode	char(30)	O	联行号
	法人信息
	法人代表证件类型	instreprCertType	char (2)	R	见证件类型一览表
	法人代表姓名	instreprName	char (120)	R	
	法人代表证件号码	instreprCertNo	char (30)	R	
	法人代表证件有效日期	instreprIdValidDate	char (8)	R	格式为：YYYYMMDD
	机构负责人信息
	机构负责人证件类型	insmanCertType	char (2)	R	见证件类型一览表
	机构负责人姓名	insmanName	char (120)	R	
	机构负责人证件号码	insmanCertNo	char (30)	R	
	机构负责人证件有效日期	insmanIdValidDate	char (8)	R	格式为：YYYYMMDD
	控股股东相关信息（可选填）
	控股股东证件类型	controlholderCertType	char (2)	O	见证件类型一览表
	控股股东姓名	controlholderName	char (120)	O	
	控股股东证件号码	controlholderCertNo	char (30)	O	
	控股股东证件有效日期	controlholderIdValidDate	char (8)	O	格式为：YYYYMMDD
	投资受益人姓名	benefitCarrier	char (120)	O	
	经办人信息
	经办人姓名	transactorName	char (120)	R	
	经办人证件类型	transactorCertType	char (1)	R	见证件类型一览表
	经办人证件号码	transactorCertificateNo	char (30)	R	
	经办人证件有效日期	transactorIdValidDate	char (8)	R	格式为：YYYYMMDD
	经办人E-MAIL地址	transactorEmail	char (40)	R	
	经办人手机号码	transactorMobilePhone	char (20)	R	
	经办人办公电话	transactorTel	char (22)	R	
	经办人传真号码	transactorFax	char (24)	R	
	经办人通讯地址	transactorAddress	char (120)	O	
	经办人邮政编码	transactorPostCode	char (6)	O	
					
	发生日期	operateDate	char (8)	O	交易发生日期，格式YYYYMMDD
	发生时间	operateTime	char (8)	O	交易发生时间，格式HHMMSS
	注册资本	regCapital	char (16)	O	两位小数，单位为 万元
	组织机构代码证	orgCode	char(32)	O	
	机构税务登记证	taxRegCert	char(32)	O	
	营业执照	busLicence	char(32)	O	
	社会统一信用代码证	soCode	char(32)	O	
	账户种类 	accountFlag 	char(1) 	O 	注意：
	此标签为可配置标签，默认无此标签，可根据基金方需要进行配置

	'0'或者为空： 普通账户,即我行客户 
	'1'：快捷账户,即他行客户 
	消息扩展	extension	char (500)	O	*/


}