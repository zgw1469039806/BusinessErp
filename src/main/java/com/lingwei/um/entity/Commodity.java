package com.lingwei.um.entity;

import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 商品表
 * </p>
 *
 * @author 马浩然
 * @since 2018-12-14
 */
public class Commodity extends Model<Commodity> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 部门id
     */
    @TableField("dep_id")
    private Integer depId;
    /**
     * 商品对应的类型
     */
    @TableField("cmdy_type")
    private Integer cmdyType;
    /**
     * 商品类型名
     */
    @TableField("cmdy_type_name")
    private String cmdyTypeName;
    /**
     * 商品名称
     */
    @TableField("cmdy_name")
    private String cmdyName;
    /**
     * 商品描述
     */
    @TableField("cmdy_description")
    private String cmdyDescription;
    /**
     * 商品单价
     */
    @TableField("cmdy_unit_price")
    private BigDecimal cmdyUnitPrice;
    /**
     * 商品库存
     */
    @TableField("cmdy_inventory")
    private Integer cmdyInventory;
    @TableField("create_time")
    private Date createTime;
    @TableField("modified_time")
    private Date modifiedTime;
    @TableField("is_delete")
    @TableLogic
    private Integer isDelete;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public Integer getCmdyType() {
        return cmdyType;
    }

    public void setCmdyType(Integer cmdyType) {
        this.cmdyType = cmdyType;
    }

    public String getCmdyTypeName() {
        return cmdyTypeName;
    }

    public void setCmdyTypeName(String cmdyTypeName) {
        this.cmdyTypeName = cmdyTypeName;
    }

    public String getCmdyName() {
        return cmdyName;
    }

    public void setCmdyName(String cmdyName) {
        this.cmdyName = cmdyName;
    }

    public String getCmdyDescription() {
        return cmdyDescription;
    }

    public void setCmdyDescription(String cmdyDescription) {
        this.cmdyDescription = cmdyDescription;
    }

    public BigDecimal getCmdyUnitPrice() {
        return cmdyUnitPrice;
    }

    public void setCmdyUnitPrice(BigDecimal cmdyUnitPrice) {
        this.cmdyUnitPrice = cmdyUnitPrice;
    }

    public Integer getCmdyInventory() {
        return cmdyInventory;
    }

    public void setCmdyInventory(Integer cmdyInventory) {
        this.cmdyInventory = cmdyInventory;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
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
        return "Commodity{" +
        "id=" + id +
        ", depId=" + depId +
        ", cmdyType=" + cmdyType +
        ", cmdyTypeName=" + cmdyTypeName +
        ", cmdyName=" + cmdyName +
        ", cmdyDescription=" + cmdyDescription +
        ", cmdyUnitPrice=" + cmdyUnitPrice +
        ", cmdyInventory=" + cmdyInventory +
        ", createTime=" + createTime +
        ", modifiedTime=" + modifiedTime +
        ", isDelete=" + isDelete +
        "}";
    }
}
