package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.TLabel;
import com.example.entity.TLabelRelationShip;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 标签关联关系表(TLabelRelationShip)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-24 14:57:54
 */
@Mapper
public interface TLabelRelationShipDao extends BaseMapper<TLabelRelationShip> {

}