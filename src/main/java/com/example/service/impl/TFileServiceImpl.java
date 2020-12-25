package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.TFile;
import com.example.dao.TFileDao;
import com.example.service.TFileService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 附件表(TFile)表服务实现类
 *
 * @author makejava
 * @since 2020-12-24 14:57:54
 */
@Service("tFileService")
public class TFileServiceImpl extends ServiceImpl<TFileDao,TFile> implements TFileService {
}