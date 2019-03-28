package com.jiaoke.activitywechatapplet.service;

import com.jiaoke.activitywechatapplet.entity.ActivityVideo;

import java.util.List;

/**
 * @Auther: Hongtao
 * @Date: 2019/3/20 14:42
 * @Description:
 */
public interface ActivityVideoService {

    public void insert(ActivityVideo activityVideo);

    public List<String> selectUrlByActivityId(Integer id);
}
