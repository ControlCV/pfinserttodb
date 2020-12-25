package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.TContact;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 联系人表(TContact)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-24 14:57:51
 */
@Mapper
public interface TContactDao extends BaseMapper<TContact> {


}