package com.example.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 附件表(TFile)实体类
 *
 * @author makejava
 * @since 2020-12-24 14:57:54
 */
public class TFile implements Serializable {
    private static final long serialVersionUID = 710914377967327208L;
    /**
    * id
    */
    private String id;
    /**
    * 附件关联编号
    */
    private String relationId;
    /**
    * 附件关联类型
    */
    private String relationType;
    /**
    * 附件名称
    */
    private String name;
    /**
    * 附件路径
    */
    private String path;
    /**
    * 附件描述
    */
    private String description;
    /**
    * 附件扩展名
    */
    private String suffix;
    /**
    * 附件大小
    */
    private Long size;
    /**
    * 原附件名称
    */
    private String originalName;
    /**
    * 附件排序
    */
    private Integer sort;
    /**
    * 是否删除
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

    public String getRelationId() {
        return relationId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId;
    }

    public String getRelationType() {
        return relationType;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
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