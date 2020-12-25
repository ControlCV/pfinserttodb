package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.TLabel;
import com.example.dao.TLabelDao;
import com.example.service.TLabelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 标签表(TLabel)表服务实现类
 *
 * @author makejava
 * @since 2020-12-24 14:57:54
 */
@Service("tLabelService")
public class TLabelServiceImpl extends ServiceImpl<TLabelDao,TLabel> implements TLabelService {

}