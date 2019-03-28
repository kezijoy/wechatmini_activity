package com.jiaoke.activitywechatapplet.service.impl;

import com.jiaoke.activitywechatapplet.dao.ActivityTypeMapper;
import com.jiaoke.activitywechatapplet.entity.ActivityType;
import com.jiaoke.activitywechatapplet.service.ActivityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Hongtao
 * @Date: 2019/3/19 14:57
 * @Description:
 */
@Service
public class ActivityTypeServiceImpl implements ActivityTypeService {

    @Autowired
    private ActivityTypeMapper activityTypeMapper;

    @Override
    public List<ActivityType> selectAll() {
        return activityTypeMapper.selectAll();
    }
}
