package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.TFile;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 附件表(TFile)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-24 14:57:54
 */
@Mapper
public interface TFileDao extends BaseMapper<TFile> {

}