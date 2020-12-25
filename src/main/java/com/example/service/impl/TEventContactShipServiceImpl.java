package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.TEventContactShip;
import com.example.dao.TEventContactShipDao;
import com.example.service.TEventContactShipService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 事件与联系人关联关系表(TEventContactShip)表服务实现类
 *
 * @author makejava
 * @since 2020-12-24 14:57:54
 */
@Service("tEventContactShipService")
public class TEventContactShipServiceImpl extends ServiceImpl<TEventContactShipDao,TEventContactShip> implements TEventContactShipService {

}