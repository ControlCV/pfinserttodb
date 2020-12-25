package com.example.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 事件与联系人关联关系表(TEventContactShip)实体类
 *
 * @author makejava
 * @since 2020-12-24 14:57:54
 */
public class TEventContactShip implements Serializable {
    private static final long serialVersionUID = 180351116464661396L;
    /**
    * id
    */
    private String id;
    /**
    * 事件编号
    */
    private String eventId;
    /**
    * 事件联系人编号
    */
    private String contactId;
    /**
    * 关联关系删除标记,0未删除1删除
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

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
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