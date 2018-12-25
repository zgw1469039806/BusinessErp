package com.lingwei.um.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 登录日志表
 * </p>
 *
 * @author 马浩然
 * @since 2018-12-14
 */
@TableName("user_login_log")
public class UserLoginLog extends Model<UserLoginLog> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 用户ID
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 用户登陆时间
     */
    @TableField("login_time")
    private Date loginTime;
    /**
     * 登陆ip
     */
    @TableField("login_ip")
    private String loginIp;
    /**
     * 登陆类型：0未成功，1成功
     */
    @TableField("login_type")
    private Integer loginType;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Integer getLoginType() {
        return loginType;
    }

    public void setLoginType(Integer loginType) {
        this.loginType = loginType;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "UserLoginLog{" +
        "id=" + id +
        ", userId=" + userId +
        ", loginTime=" + loginTime +
        ", loginIp=" + loginIp +
        ", loginType=" + loginType +
        "}";
    }
}
