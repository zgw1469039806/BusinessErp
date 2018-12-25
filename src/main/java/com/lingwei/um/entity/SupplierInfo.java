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
 * 供货商表（一期不用）
 * </p>
 *
 * @author 马浩然
 * @since 2018-12-14
 */
@TableName("supplier_info")
public class SupplierInfo extends Model<SupplierInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 供货商所属的userID
     */
    @TableField("user_id")
    private Integer userId;
    @TableField("splr_name")
    private String splrName;
    @TableField("splr_mobile")
    private String splrMobile;
    @TableField("splr_province")
    private String splrProvince;
    @TableField("splr_city")
    private String splrCity;
    @TableField("splr_district")
    private String splrDistrict;
    @TableField("splr_address")
    private String splrAddress;
    private Date createTime;
    private Date updateTime;
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

    public String getSplrName() {
        return splrName;
    }

    public void setSplrName(String splrName) {
        this.splrName = splrName;
    }

    public String getSplrMobile() {
        return splrMobile;
    }

    public void setSplrMobile(String splrMobile) {
        this.splrMobile = splrMobile;
    }

    public String getSplrProvince() {
        return splrProvince;
    }

    public void setSplrProvince(String splrProvince) {
        this.splrProvince = splrProvince;
    }

    public String getSplrCity() {
        return splrCity;
    }

    public void setSplrCity(String splrCity) {
        this.splrCity = splrCity;
    }

    public String getSplrDistrict() {
        return splrDistrict;
    }

    public void setSplrDistrict(String splrDistrict) {
        this.splrDistrict = splrDistrict;
    }

    public String getSplrAddress() {
        return splrAddress;
    }

    public void setSplrAddress(String splrAddress) {
        this.splrAddress = splrAddress;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
        return "SupplierInfo{" +
        "id=" + id +
        ", userId=" + userId +
        ", splrName=" + splrName +
        ", splrMobile=" + splrMobile +
        ", splrProvince=" + splrProvince +
        ", splrCity=" + splrCity +
        ", splrDistrict=" + splrDistrict +
        ", splrAddress=" + splrAddress +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", isDelete=" + isDelete +
        "}";
    }
}
