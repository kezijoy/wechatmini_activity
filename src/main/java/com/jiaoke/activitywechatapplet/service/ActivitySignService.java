package com.jiaoke.activitywechatapplet.service;

/**
 * @Author: Hongtao
 * @Date: 2019/3/27 15:56
 * @Description:
 */
public interface ActivitySignService {
    public Object signIn(int activityId,int userId);

    public String checkUserIsSign(int activityId,int userId);
}
