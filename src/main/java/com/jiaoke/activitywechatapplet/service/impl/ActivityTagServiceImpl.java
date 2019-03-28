package com.jiaoke.activitywechatapplet.service.impl;

import com.jiaoke.activitywechatapplet.dao.ActivityTagMapper;
import com.jiaoke.activitywechatapplet.entity.ActivityTag;
import com.jiaoke.activitywechatapplet.service.ActivityTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Hongtao
 * @Date: 2019/3/19 14:57
 * @Description:
 */
@Service
public class ActivityTagServiceImpl implements ActivityTagService {

    @Autowired
    private ActivityTagMapper activityTagMapper;

    @Override
    public List<ActivityTag> selectAll() {
        return activityTagMapper.selectAll();
    }
}
