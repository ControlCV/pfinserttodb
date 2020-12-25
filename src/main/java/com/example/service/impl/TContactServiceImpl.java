package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.TContact;
import com.example.dao.TContactDao;
import com.example.service.TContactService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 联系人表(TContact)表服务实现类
 *
 * @author makejava
 * @since 2020-12-24 14:57:52
 */
@Service("tContactService")
public class TContactServiceImpl extends ServiceImpl<TContactDao,TContact> implements TContactService {

}