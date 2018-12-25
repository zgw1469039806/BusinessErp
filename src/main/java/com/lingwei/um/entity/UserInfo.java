package com.lingwei.um.entity;

import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.enums.IdType;

import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 用户基本信息表
 * </p>
 *
 * @author 马浩然
 * @since 2018-12-14
 */
@TableName("user_info")
public class UserInfo extends Model<UserInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 用户名
     */
    @TableField("user_name")
    private String userName;
    /**
     * 用户密码
     */
    @TableField("user_password")
    private String userPassword;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 地址
     */
    private String address;
    /**
     * 部门id
     */
    private Integer depId;
    /**
     * 用户状态 0：正常 1：冻结
     */
    private Integer status;
    /**
     * 到期时间
     */
    @TableField("maturity_time")
    private Date maturityTime;
    @TableField("modified_time")
    private Date modifiedTime;
    @TableField("create_time")
    private Date createTime;
    /**
     * 逻辑删除：0存在 1删除
     */
    @TableLogic
    private Integer isDelete;

    public MemberInfo getMemberInfo() {
        return memberInfo;
    }

    public void setMemberInfo(MemberInfo memberInfo) {
        this.memberInfo = memberInfo;
    }

    private MemberInfo memberInfo;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getMaturityTime() {
        return maturityTime;
    }

    public void setMaturityTime(Date maturityTime) {
        this.maturityTime = maturityTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", userName=" + userName +
                ", userPassword=" + userPassword +
                ", mobile=" + mobile +
                ", address=" + address +
                ", depId=" + depId +
                ", status=" + status +
                ", maturityTime=" + maturityTime +
                ", modifiedTime=" + modifiedTime +
                ", createTime=" + createTime +
                ", isDelete=" + isDelete +
                "}";
    }
}
