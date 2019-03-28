package com.jiaoke.activitywechatapplet.service.impl;

import com.jiaoke.activitywechatapplet.dao.ActivityTypeRelationMapper;
import com.jiaoke.activitywechatapplet.entity.ActivityTypeRelation;
import com.jiaoke.activitywechatapplet.service.ActivityTypeRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: Hongtao
 * @Date: 2019/3/20 10:19
 * @Description:
 */
@Service
public class ActivityTypeRelationServiceImpl implements ActivityTypeRelationService {

    @Autowired
    private ActivityTypeRelationMapper activityTypeRelationMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insert(ActivityTypeRelation activityTypeRelation) {
        activityTypeRelationMapper.insert(activityTypeRelation);
    }

    @Override
    public List<String> selectTypeByActivityId(Integer id) {
        return activityTypeRelationMapper.selectTypeByActivityId(id);
    }
}
