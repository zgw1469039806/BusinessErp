package com.lingwei.um.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 订单详情
 * </p>
 *
 * @author 马浩然
 * @since 2018-12-14
 */
@TableName("commodity_order_prop")
public class CommodityOrderProp extends Model<CommodityOrderProp> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 对应订单表的id
     */
    @TableField("order_id")
    private Integer orderId;
    /**
     * 会员的id
     */
    @TableField("mbr_id")
    private Integer mbrId;
    /**
     * 部门的id
     */
    @TableField("dep_id")
    private Integer depId;
    /**
     * 商品编号
     */
    @TableField("cmd_id")
    private Integer cmdId;
    /**
     * 商品名
     */
    @TableField("cmd_name")
    private String cmdName;
    /**
     * 售出数量
     */
    @TableField("cmd_number")
    private Integer cmdNumber;
    /**
     * 商品卖出的价格
     */
    @TableField("cmd_price")
    private BigDecimal cmdPrice;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
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

    public Integer getCmdId() {
        return cmdId;
    }

    public void setCmdId(Integer cmdId) {
        this.cmdId = cmdId;
    }

    public String getCmdName() {
        return cmdName;
    }

    public void setCmdName(String cmdName) {
        this.cmdName = cmdName;
    }

    public Integer getCmdNumber() {
        return cmdNumber;
    }

    public void setCmdNumber(Integer cmdNumber) {
        this.cmdNumber = cmdNumber;
    }

    public BigDecimal getCmdPrice() {
        return cmdPrice;
    }

    public void setCmdPrice(BigDecimal cmdPrice) {
        this.cmdPrice = cmdPrice;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "CommodityOrderProp{" +
        "id=" + id +
        ", orderId=" + orderId +
        ", mbrId=" + mbrId +
        ", depId=" + depId +
        ", cmdId=" + cmdId +
        ", cmdName=" + cmdName +
        ", cmdNumber=" + cmdNumber +
        ", cmdPrice=" + cmdPrice +
        "}";
    }
}
