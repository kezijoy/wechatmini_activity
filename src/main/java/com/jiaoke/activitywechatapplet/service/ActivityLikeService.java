package com.jiaoke.activitywechatapplet.service;


/**
 * @Author: Hongtao
 * @Date: 2019/3/26 10:10
 * @Description:
 */
public interface ActivityLikeService {

    public void likeActivity(int activityId, int userId);

    public void cancelLike(int activityId, int userId);

    public String checkUserIsLike(int activityId, int userId);
}
