package com.jiaoke.activitywechatapplet.service.impl;

import com.jiaoke.activitywechatapplet.dao.ActivityVideoMapper;
import com.jiaoke.activitywechatapplet.entity.ActivityVideo;
import com.jiaoke.activitywechatapplet.service.ActivityVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: Hongtao
 * @Date: 2019/3/20 14:48
 * @Description:
 */
@Service
public class ActivityVideoServiceImpl implements ActivityVideoService {

    @Autowired
    private ActivityVideoMapper activityVideoMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insert(ActivityVideo activityVideo) {
        activityVideoMapper.insert(activityVideo);
    }

    @Override
    public List<String> selectUrlByActivityId(Integer id) {
        return activityVideoMapper.selectUrlByActivityId(id);
    }
}
