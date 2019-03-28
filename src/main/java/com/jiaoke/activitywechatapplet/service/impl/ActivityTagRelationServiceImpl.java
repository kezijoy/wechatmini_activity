package com.jiaoke.activitywechatapplet.service.impl;

import com.jiaoke.activitywechatapplet.dao.ActivityTagRelationMapper;
import com.jiaoke.activitywechatapplet.entity.ActivityTagRelation;
import com.jiaoke.activitywechatapplet.service.ActivityTagRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: Hongtao
 * @Date: 2019/3/20 10:36
 * @Description:
 */
@Service
public class ActivityTagRelationServiceImpl implements ActivityTagRelationService {

    @Autowired
    private ActivityTagRelationMapper activityTagRelationMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insert(ActivityTagRelation activityTagRelation) {
        activityTagRelationMapper.insert(activityTagRelation);
    }

    @Override
    public List<String> selectTagByActivityId(Integer id) {
        return activityTagRelationMapper.selectTagByActivityId(id);
    }
}
