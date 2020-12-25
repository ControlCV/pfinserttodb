package com.example.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 事件表(TEvent)实体类
 *
 * @author makejava
 * @since 2020-12-24 14:57:54
 */
public class TEvent implements Serializable {
    private static final long serialVersionUID = -94244511278914273L;
    /**
    * 事件编号，主键
    */
    private String id;
    /**
    * 事件负责人编号
    */
    private String ownerId;
    /**
    * 事件负责人类型,1内勤 2外勤 3普通用户
    */
    private String ownerType;
    /**
    * 事件主题
    */
    private String subject;
    /**
    * 事件类型,0拜访
    */
    private String type;
    /**
    * 事件子类型
    */
    private String subType;
    /**
    * 事件开始日期时间
    */
    private Date startDateTime;
    /**
    * 事件结束日期时间
    */
    private Date endDateTime;
    /**
    * 事件开始日期
    */
    private Date startDate;
    /**
    * 事件结束日期
    */
    private Date endDate;
    /**
    * 事件提醒日期时间
    */
    private Date reminderDateTime;
    /**
    * 事件位置地址
    */
    private String locationAddress;
    /**
    * 事件位置坐标
    */
    private String locationCoordinate;
    /**
    * 事件描述
    */
    private String description;
    /**
    * 事件备注
    */
    private String remark;
    /**
    * 是否有后续事件,0无1有
    */
    private String haveFollowEvent;
    /**
    * 前事件编号
    */
    private String preEventId;
    /**
    * 优先级最高标签
    */
    private String highestSortLabelId;
    /**
    * 事件来源,0日程1建议书2保单
    */
    private String source;
    /**
    * 事件状态,0未完成1已完成
    */
    private String status;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public Date getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Date getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getReminderDateTime() {
        return reminderDateTime;
    }

    public void setReminderDateTime(Date reminderDateTime) {
        this.reminderDateTime = reminderDateTime;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress;
    }

    public String getLocationCoordinate() {
        return locationCoordinate;
    }

    public void setLocationCoordinate(String locationCoordinate) {
        this.locationCoordinate = locationCoordinate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getHaveFollowEvent() {
        return haveFollowEvent;
    }

    public void setHaveFollowEvent(String haveFollowEvent) {
        this.haveFollowEvent = haveFollowEvent;
    }

    public String getPreEventId() {
        return preEventId;
    }

    public void setPreEventId(String preEventId) {
        this.preEventId = preEventId;
    }

    public String getHighestSortLabelId() {
        return highestSortLabelId;
    }

    public void setHighestSortLabelId(String highestSortLabelId) {
        this.highestSortLabelId = highestSortLabelId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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