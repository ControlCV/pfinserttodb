package com.example.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 标签表(TLabel)实体类
 *
 * @author makejava
 * @since 2020-12-24 14:57:54
 */
public class TLabel implements Serializable {
    private static final long serialVersionUID = 210980056140748126L;
    /**
    * 标签编号
    */
    private String id;
    /**
    * 标签名称
    */
    private String name;
    /**
    * 标签类型
    */
    private String type;
    /**
    * 标签颜色
    */
    private String color;
    /**
    * 标签关联类型
    */
    private String relationType;
    /**
    * 排序
    */
    private Integer sort;
    /**
    * 是否删除
    */
    private Integer isDelete;
    /**
    * 代理人编号
    */
    private String ownerId;
    
    private String ownerType;
    /**
    * 创建日期
    */
    private Date createdDateTime;
    /**
    * 创建用户
    */
    private String createdById;
    /**
    * 更新日期
    */
    private Date updatedDateTime;
    /**
    * 更新用户
    */
    private String updatedById;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRelationType() {
        return relationType;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }

    public Date getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public String getCreatedById() {
        return createdById;
    }

    public void setCreatedById(String createdById) {
        this.createdById = createdById;
    }

    public Date getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(Date updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

    public String getUpdatedById() {
        return updatedById;
    }

    public void setUpdatedById(String updatedById) {
        this.updatedById = updatedById;
    }

}