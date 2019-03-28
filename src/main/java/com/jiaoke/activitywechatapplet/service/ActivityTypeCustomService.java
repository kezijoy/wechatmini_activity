package com.jiaoke.activitywechatapplet.service;

import com.jiaoke.activitywechatapplet.entity.ActivityTypeCustom;

import java.util.List;

/**
 * @Author: Hongtao
 * @Date: 2019/3/21 10:33
 * @Description:
 */
public interface ActivityTypeCustomService {
    public void insert(ActivityTypeCustom activityTypeCustom);

    public List<String> selectNameByActivityId(Integer id);
}
