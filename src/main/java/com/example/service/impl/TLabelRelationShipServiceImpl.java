package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.TLabelRelationShip;
import com.example.dao.TLabelRelationShipDao;
import com.example.service.TLabelRelationShipService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 标签关联关系表(TLabelRelationShip)表服务实现类
 *
 * @author makejava
 * @since 2020-12-24 14:57:54
 */
@Service("tLabelRelationShipService")
public class TLabelRelationShipServiceImpl extends ServiceImpl<TLabelRelationShipDao,TLabelRelationShip> implements TLabelRelationShipService {

}