package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.TEvent;
import com.example.dao.TEventDao;
import com.example.service.TEventService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 事件表(TEvent)表服务实现类
 *
 * @author makejava
 * @since 2020-12-24 14:57:54
 */
@Service("tEventService")
public class TEventServiceImpl extends ServiceImpl<TEventDao,TEvent> implements TEventService {

}