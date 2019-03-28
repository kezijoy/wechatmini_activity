package com.jiaoke.activitywechatapplet.service;


import java.util.List;
import java.util.Map;

/**
 * @Author: Hongtao
 * @Date: 2019/3/26 10:10
 * @Description:
 */
public interface ActivityCommentService {

    public void commentActivity(int activityId, int userId,String content);

    public List<Map<String,Object>> queryComment(int activityId);

    //public String checkUserIsFollow(int activityId, int userId);
}
