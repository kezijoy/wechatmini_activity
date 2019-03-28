package com.jiaoke.activitywechatapplet.service.impl;

import com.jiaoke.activitywechatapplet.dao.ActivityImageMapper;
import com.jiaoke.activitywechatapplet.entity.ActivityImage;
import com.jiaoke.activitywechatapplet.service.ActivityImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: Hongtao
 * @Date: 2019/3/20 14:45
 * @Description:
 */
@Service
public class ActivityImageServiceImpl implements ActivityImageService {

    @Autowired
    private ActivityImageMapper activityImageMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insert(ActivityImage activityImage) {
        activityImageMapper.insert(activityImage);
    }

    @Override
    public List<String> selectUrlByActivityId(Integer id) {
        return activityImageMapper.selectUrlByActivityId(id);
    }
}
