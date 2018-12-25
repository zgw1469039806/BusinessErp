package com.lingwei.um.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author 马浩然
 * @since 2018-12-14
 */
@TableName("commodity_order")
public class CommodityOrder extends Model<CommodityOrder> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 订单流水号
     */
    @TableField("order_id")
    private String orderId;
    /**
     * 订单对应的会员
     */
    @TableField("mbr_id")
    private Integer mbrId;
    /**
     * 订单属于的部门
     */
    @TableField("dep_id")
    private Integer depId;
    /**
     * 应收款（原价）
     */
    @TableField("cost_price")
    private BigDecimal costPrice;
    /**
     * 结算价
     */
    @TableField("current_price")
    private BigDecimal currentPrice;
    /**
     * 备注
     */
    private String remarks;
    @TableField("create_time")
    private Date createTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getMbrId() {
        return mbrId;
    }

    public void setMbrId(Integer mbrId) {
        this.mbrId = mbrId;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "CommodityOrder{" +
        "id=" + id +
        ", orderId=" + orderId +
        ", mbrId=" + mbrId +
        ", depId=" + depId +
        ", costPrice=" + costPrice +
        ", currentPrice=" + currentPrice +
        ", remarks=" + remarks +
        ", createTime=" + createTime +
        "}";
    }
}
