package com.lingwei.um.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

@ApiModel("任务条件封装")
public class GoodsOrderCondition {
    @ApiModelProperty("任务编号")
    private Integer id;
    @ApiModelProperty("用户编号")
    private Integer uid;
    @ApiModelProperty("用户名")
    private String uname;
    @ApiModelProperty("订单编号")
    private String orderNumber;
    @ApiModelProperty("汇率")
    private BigDecimal exchangeRate;
    @ApiModelProperty("佣金费")
    private BigDecimal commission;
    @ApiModelProperty("官网单号")
    private String networkNumber;
    @ApiModelProperty("物流单号")
    private String logisticsNumber;
    @ApiModelProperty("标题")
    private String title;
    @ApiModelProperty("卖家名称")
    private String sellerName;
    @ApiModelProperty("asin")
    private String asin;
    @ApiModelProperty("关键词")
    private String keyword;
    @ApiModelProperty("商品来源")
    private String source;
    @ApiModelProperty("下单方式")
    private String singleWay;
    @ApiModelProperty("站点")
    private String site;
    @ApiModelProperty("原价")
    private BigDecimal price;
    @ApiModelProperty("总价")
    private BigDecimal totalPrice;
    @ApiModelProperty("备注")
    private String msg;
    @ApiModelProperty("状态0:待付款 1:待审核 2:交易成功 3:驳回 4:用户取消订单")
    private Integer state;
    @ApiModelProperty("驳回原因")
    private String reject;
    @ApiModelProperty("数量")
    private Integer number;


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

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public String getNetworkNumber() {
        return networkNumber;
    }

    public void setNetworkNumber(String networkNumber) {
        this.networkNumber = networkNumber;
    }

    public String getLogisticsNumber() {
        return logisticsNumber;
    }

    public void setLogisticsNumber(String logisticsNumber) {
        this.logisticsNumber = logisticsNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSingleWay() {
        return singleWay;
    }

    public void setSingleWay(String singleWay) {
        this.singleWay = singleWay;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getReject() {
        return reject;
    }

    public void setReject(String reject) {
        this.reject = reject;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
