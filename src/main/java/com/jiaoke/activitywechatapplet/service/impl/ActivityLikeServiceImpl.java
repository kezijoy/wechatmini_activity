package com.jiaoke.activitywechatapplet.service.impl;

import com.jiaoke.activitywechatapplet.dao.ActivityLikeMapper;
import com.jiaoke.activitywechatapplet.entity.ActivityLike;
import com.jiaoke.activitywechatapplet.service.ActivityLikeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @Author: Hongtao
 * @Date: 2019/3/26 10:24
 * @Description:
 */
@Service
public class ActivityLikeServiceImpl implements ActivityLikeService {

    @Resource
    private ActivityLikeMapper activityLikeMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void likeActivity(int activityId, int userId) {
        ActivityLike activityLike = new ActivityLike();
        activityLike.setActivityId(activityId);
        activityLike.setUserId(userId);
        activityLike.setCreateTime(new Date());
        activityLikeMapper.insert(activityLike);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void cancelLike(int activityId, int userId) {
        activityLikeMapper.deleteByActivityIdAndUserId(activityId,userId);
    }

    @Override
    public String checkUserIsLike(int activityId, int userId) {
        ActivityLike activityLike = activityLikeMapper.selectByActivityIdAndUserId(activityId, userId);
        if(activityLike != null){
            return "yes";
        }
        return "no";
    }
}
