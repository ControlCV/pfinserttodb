package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.TEventContactShip;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 事件与联系人关联关系表(TEventContactShip)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-24 14:57:54
 */
@Mapper
public interface TEventContactShipDao extends BaseMapper<TEventContactShip> {


}