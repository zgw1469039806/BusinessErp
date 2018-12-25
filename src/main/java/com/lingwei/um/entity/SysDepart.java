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
 * 部门表结构
 * </p>
 *
 * @author 马浩然
 * @since 2018-12-14
 */
@TableName("sys_depart")
public class SysDepart extends Model<SysDepart> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 部门名称
     */
    private String name;
    /**
     * 上级部门id
     */
    @TableField("parent_id")
    private Integer parentId;
    /**
     * 部门层级
     */
    private Integer level;
    /**
     * 部门等级：0限制注册500人 1限制1000人
     */
    private Integer lv;
    /**
     * 部门在当前层级下的顺序，由小到大，越小越靠前
     */
    private Integer seq;
    /**
     * 备注
     */
    private String remark;
    /**
     * 部门到期时间
     */
    @TableField("maturity_time")
    private Date maturityTime;
    /**
     * 操作者编号
     */
    private Integer operatorId;
    @TableField("modified_time")
    private Date modifiedTime;
    @TableField("create_time")
    private Date createTime;
    @TableField("is_delete")
    @TableLogic
    private Integer isDelete;

    public List<UserInfo> getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(List<UserInfo> userInfo) {
        this.userInfo = userInfo;
    }

    //基本信息表
    private List<UserInfo> userInfo;


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

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getLv() {
        return lv;
    }

    public void setLv(Integer lv) {
        this.lv = lv;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getMaturityTime() {
        return maturityTime;
    }

    public void setMaturityTime(Date maturityTime) {
        this.maturityTime = maturityTime;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
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
        return "SysDepart{" +
                "id=" + id +
                ", name=" + name +
                ", parentId=" + parentId +
                ", level=" + level +
                ", lv=" + lv +
                ", seq=" + seq +
                ", remark=" + remark +
                ", maturityTime=" + maturityTime +
                ", operatorId=" + operatorId +
                ", modifiedTime=" + modifiedTime +
                ", createTime=" + createTime +
                ", isDelete=" + isDelete +
                "}";
    }
}
