package com.jiaoke.activitywechatapplet.service;


/**
 * @Author: Hongtao
 * @Date: 2019/3/26 10:10
 * @Description:
 */
public interface ActivityFollowService {

    public void followActivity(int activityId,int userId);

    public void cancelFollow(int activityId,int userId);

    public String checkUserIsFollow(int activityId, int userId);
}
