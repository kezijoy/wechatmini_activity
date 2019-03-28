package com.jiaoke.activitywechatapplet.service.impl;

import com.jiaoke.activitywechatapplet.dao.ActivityCommentMapper;
import com.jiaoke.activitywechatapplet.entity.ActivityComment;
import com.jiaoke.activitywechatapplet.service.ActivityCommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: Hongtao
 * @Date: 2019/3/26 16:51
 * @Description:
 */
@Service
public class ActivityCommentServiceImpl implements ActivityCommentService {

    @Resource
    private ActivityCommentMapper activityCommentMapper;

    @Override
    public void commentActivity(int activityId, int userId, String content) {
        ActivityComment activityComment = new ActivityComment();
        activityComment.setActivityId(activityId);
        activityComment.setUserId(userId);
        activityComment.setContent(content);
        //activityComment.setCreateTime(new Date());
        activityCommentMapper.insert(activityComment);
    }

    @Override
    public List<Map<String, Object>> queryComment(int activityId) {
        return activityCommentMapper.selectByActivityId(activityId);
    }
}
