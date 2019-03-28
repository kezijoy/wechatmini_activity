package com.jiaoke.activitywechatapplet.service;

import com.jiaoke.activitywechatapplet.entity.ActivityType;
import com.jiaoke.activitywechatapplet.entity.ActivityTypeRelation;

import java.util.List;

/**
 * @Auther: Hongtao
 * @Date: 2019/3/19 14:33
 * @Description:
 */
public interface ActivityTypeRelationService {

    public void insert(ActivityTypeRelation activityTypeRelation);

    public List<String> selectTypeByActivityId(Integer id);
}
