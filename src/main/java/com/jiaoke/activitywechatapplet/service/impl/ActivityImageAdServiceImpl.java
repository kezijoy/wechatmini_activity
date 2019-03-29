package com.jiaoke.activitywechatapplet.service.impl;

import com.jiaoke.activitywechatapplet.dao.ActivityImageAdMapper;
import com.jiaoke.activitywechatapplet.entity.ActivityImageAd;
import com.jiaoke.activitywechatapplet.service.ActivityImageAdService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Hongtao
 * @Date: 2019/3/28 17:14
 * @Description:
 */
@Service
public class ActivityImageAdServiceImpl implements ActivityImageAdService {

    @Resource
    private ActivityImageAdMapper activityImageAdMapper;

    @Override
    public List<ActivityImageAd> queryAll() {
        return activityImageAdMapper.selectAll();
    }
}
