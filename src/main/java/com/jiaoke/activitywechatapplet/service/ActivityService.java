package com.jiaoke.activitywechatapplet.service;

import com.jiaoke.activitywechatapplet.entity.Activity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: Hongtao
 * @Date: 2019/3/19 13:23
 * @Description:
 */
public interface ActivityService {

    public Object addActivity(Activity activity,String typeIds,String tagIds, String imgUrl, String videoUrl, String selfTypes, String selfTags);

    public Object selectById(int id, int userId);

    public int selectMaxId();

    public Object updateActivity(Activity activity,String typeIds,String tagIds, String imgUrl, String videoUrl, String selfTypes, String selfTags);

    /**
     * @Author hongtao
     * @Description 查询Activity
     * @Date 13:15 2019/3/22
     * @Param [pageNum, pageSize]
     * @return java.lang.Object
     **/
    public Object selectAll(int pageNum,int pageSize);

    /**
     * @Author hongtao
     * @Description 根据组织者查询activity
     * @Date 11:03 2019/3/26
     * @Param [userId]
     * @return java.util.List<com.jiaoke.activitywechatapplet.entity.Activity>
     **/
    public List<Activity> queryByCreatorId(int userId);

    /**
     * @Author hongtao
     * @Description 查询用户关注的活动
     * @Date 14:13 2019/3/26
     * @Param [userId]
     * @return java.util.List<com.jiaoke.activitywechatapplet.entity.Activity>
     **/
    public List<Activity> queryByFollow(int userId);

    /**
     * @Author hongtao
     * @Description 查询用户参与的活动
     * @Date 17:58 2019/3/26
     * @Param [userId]
     * @return java.util.List<com.jiaoke.activitywechatapplet.entity.Activity>
     **/
    public List<Activity> queryByApplication(int userId);

    public void updateActivityStatus(Integer activityId,String activityStatus);
}
