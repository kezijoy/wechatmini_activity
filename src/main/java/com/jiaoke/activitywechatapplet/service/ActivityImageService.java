package com.jiaoke.activitywechatapplet.service;

import com.jiaoke.activitywechatapplet.entity.ActivityImage;

import java.util.List;

/**
 * @Auther: Hongtao
 * @Date: 2019/3/20 14:42
 * @Description:
 */
public interface ActivityImageService {

    public void insert(ActivityImage activityImage);

    public List<String> selectUrlByActivityId(Integer id);
}
