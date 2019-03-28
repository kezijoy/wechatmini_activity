package com.jiaoke.activitywechatapplet.service;

import com.jiaoke.activitywechatapplet.entity.ActivityTagCustom;

import java.util.List;

/**
 * @Author: Hongtao
 * @Date: 2019/3/21 10:38
 * @Description:
 */
public interface ActivityTagCustomService {
    public void insert(ActivityTagCustom activityTagCustom);

    public List<String> selectNameByActivityId(Integer id);
}
