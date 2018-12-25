package com.lingwei.um.entity;

import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 会员表
 * </p>
 *
 * @author 马浩然
 * @since 2018-12-14
 */
@TableName("member_info")
public class MemberInfo extends Model<MemberInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 会员所属的userID
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 会员名
     */
    @TableField("mbr_name")
    private String mbrName;
    /**
     * 会员手机号
     */
    @TableField("mbr_mobile")
    private String mbrMobile;
    /**
     * 地址
     */
    @TableField("mbr_address")
    private String mbrAddress;
    /**
     * 用户积分
     */
    @TableField("mbr_integral")
    private Double mbrIntegral;
    @TableField("modified_time")
    private Date modifiedTime;
    @TableField("create_time")
    private Date createTime;
    /**
     * 逻辑删除：0存在 1删除
     */
    @TableLogic
    private Integer isDelete;


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

    public String getMbrName() {
        return mbrName;
    }

    public void setMbrName(String mbrName) {
        this.mbrName = mbrName;
    }

    public String getMbrMobile() {
        return mbrMobile;
    }

    public void setMbrMobile(String mbrMobile) {
        this.mbrMobile = mbrMobile;
    }

    public String getMbrAddress() {
        return mbrAddress;
    }

    public void setMbrAddress(String mbrAddress) {
        this.mbrAddress = mbrAddress;
    }

    public Double getMbrIntegral() {
        return mbrIntegral;
    }

    public void setMbrIntegral(Double mbrIntegral) {
        this.mbrIntegral = mbrIntegral;
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
        return "MemberInfo{" +
        "id=" + id +
        ", userId=" + userId +
        ", mbrName=" + mbrName +
        ", mbrMobile=" + mbrMobile +
        ", mbrAddress=" + mbrAddress +
        ", mbrIntegral=" + mbrIntegral +
        ", modifiedTime=" + modifiedTime +
        ", createTime=" + createTime +
        ", isDelete=" + isDelete +
        "}";
    }
}
