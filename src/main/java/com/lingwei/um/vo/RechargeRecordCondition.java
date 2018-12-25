package com.lingwei.um.vo;

import com.lingwei.framework.core.PageResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@ApiModel("充值/提现记录")
public class RechargeRecordCondition extends PageResult {

    @ApiModelProperty("编号")
    private Integer id;
    @ApiModelProperty("用户名")
    private String uname;
    @ApiModelProperty("类型 传入（0:全部 1:充值 2:提现） 输出（1:支付宝充值 2:微信充值 3:后台充值 4:提现）")
    private Integer type;
    @ApiModelProperty("金额")
    private BigDecimal money;
    @ApiModelProperty("余额")
    private BigDecimal balance;
    @ApiModelProperty("支付宝账号")
    private String alipay;
    @ApiModelProperty("支付宝名字")
    private String alipayName;
    @ApiModelProperty("状态 -1：全部 0：充值成功，1：提现审核中，2：提现成功 3：驳回")
    private Integer status;
    @ApiModelProperty("开始时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;
    @ApiModelProperty("结束时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getAlipay() {
        return alipay;
    }

    public void setAlipay(String alipay) {
        this.alipay = alipay;
    }

    public String getAlipayName() {
        return alipayName;
    }

    public void setAlipayName(String alipayName) {
        this.alipayName = alipayName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
