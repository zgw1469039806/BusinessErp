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
 * 商品类型
 * </p>
 *
 * @author 马浩然
 * @since 2018-12-14
 */
@TableName("commodity_type")
public class CommodityType extends Model<CommodityType> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 商品类型
     */
    private String name;
    /**
     * 用户id
     */
    @TableField("user_id")
    private Integer userId;
    @TableField("modified_time")
    private Date modifiedTime;
    @TableField("create_time")
    private Date createTime;
    @TableField("is_delete")
    @TableLogic
    private Integer isDelete;


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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
        return "CommodityType{" +
        "id=" + id +
        ", name=" + name +
        ", userId=" + userId +
        ", modifiedTime=" + modifiedTime +
        ", createTime=" + createTime +
        ", isDelete=" + isDelete +
        "}";
    }
}
