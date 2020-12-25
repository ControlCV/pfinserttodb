package com.example.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 联系人表(TContact)实体类
 *
 * @author makejava
 * @since 2020-12-24 14:57:48
 */
public class TContact implements Serializable {
    private static final long serialVersionUID = 507275471837235190L;
    /**
    * 主键id
    */
    private String id;
    /**
    * 联系人归属人编号
    */
    private String ownerId;
    /**
    * 联系人归属人类型
    */
    private String ownerType;
    /**
    * 联系人类型,0客户
    */
    private String type;
    /**
    * 联系人姓名
    */
    private String name;
    /**
    * 联系人手机号码
    */
    private String mobile;
    /**
    * 联系人邮箱地址
    */
    private String email;
    /**
    * 是否删除,0未删除1删除
    */
    private Integer isDelete;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
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