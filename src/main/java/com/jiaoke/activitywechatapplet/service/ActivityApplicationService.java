package com.jiaoke.activitywechatapplet.service;

/**
 * @Author: Hongtao
 * @Date: 2019/3/22 14:42
 * @Description:
 */
public interface ActivityApplicationService {
    /**
     * @Author hongtao
     * @Description 用户报名活动接口
     * @Date 14:45 2019/3/22
     * @Param [activityId 活动id, userId 用户id]
     * @return java.lang.Object
     **/
    public Object registrationActivity(int activityId,int userId,int person,String note);

    /**
     * @Author hongtao
     * @Description 检查用户是否报名某活动
     * @Date 15:42 2019/3/22
     * @Param [activityId, userId]
     * @return java.lang.String
     **/
    public String checkUserIsRegistration(int activityId,int userId);

    /**
     * @Author hongtao
     * @Description 查询已报名人数
     * @Date 14:11 2019/3/27
     * @Param [activityId]
     * @return int
     **/
    public int queryPersonNum(int activityId);
}
