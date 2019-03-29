package com.jiaoke.activitywechatapplet.service;

import com.jiaoke.activitywechatapplet.entity.ActivityImageAd;

import java.util.List;

/**
 * @Author: Hongtao
 * @Date: 2019/3/28 17:13
 * @Description:
 */
public interface ActivityImageAdService {
    /**
     * @Author hongtao
     * @Description 查询所有广告图片
     * @Date 17:16 2019/3/28
     * @Param []
     * @return java.util.List<com.jiaoke.activitywechatapplet.entity.ActivityImageAd>
     **/
    public List<ActivityImageAd> queryAll();
}
