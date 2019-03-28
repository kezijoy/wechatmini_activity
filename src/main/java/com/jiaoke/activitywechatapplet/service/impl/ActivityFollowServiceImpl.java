package com.jiaoke.activitywechatapplet.service.impl;

import com.jiaoke.activitywechatapplet.dao.ActivityFollowMapper;
import com.jiaoke.activitywechatapplet.entity.ActivityFollow;
import com.jiaoke.activitywechatapplet.service.ActivityFollowService;
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
public class ActivityFollowServiceImpl implements ActivityFollowService {

    @Resource
    private ActivityFollowMapper activityFollowMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void followActivity(int activityId, int userId) {
        ActivityFollow activityFollow = new ActivityFollow();
        activityFollow.setActivityId(activityId);
        activityFollow.setUserId(userId);
        activityFollow.setCreateTime(new Date());
        activityFollowMapper.insert(activityFollow);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void cancelFollow(int activityId, int userId) {
        activityFollowMapper.deleteByActivityIdAndUserId(activityId,userId);
    }

    @Override
    public String checkUserIsFollow(int activityId, int userId) {
        ActivityFollow activityFollow = activityFollowMapper.selectByActivityIdAndUserId(activityId, userId);
        if(activityFollow != null){
            return "yes";
        }
        return "no";
    }
}
