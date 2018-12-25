package com.lingwei.um.vo;

import com.lingwei.framework.core.PageResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

@ApiModel("用户条件封装")
public class UserInfoCondition extends PageResult {
    @ApiModelProperty("用户编号")
    private Integer id;
    @ApiModelProperty("用户名")
    private String name;
    @ApiModelProperty("用户密码")
    private String pwd;
    @ApiModelProperty("token")
    private String token;
    @ApiModelProperty("等级")
    private Integer lv;
    @ApiModelProperty("金额")
    private BigDecimal money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getLv() {
        return lv;
    }

    public void setLv(Integer lv) {
        this.lv = lv;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}
