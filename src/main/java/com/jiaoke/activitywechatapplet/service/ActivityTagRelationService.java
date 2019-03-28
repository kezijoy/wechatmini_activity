package com.jiaoke.activitywechatapplet.service;

import com.jiaoke.activitywechatapplet.entity.ActivityTagRelation;

import java.util.List;

/**
 * @Auther: Hongtao
 * @Date: 2019/3/19 14:33
 * @Description:
 */
public interface ActivityTagRelationService {

    public void insert(ActivityTagRelation activityTagRelation);

    public List<String> selectTagByActivityId(Integer id);
}
