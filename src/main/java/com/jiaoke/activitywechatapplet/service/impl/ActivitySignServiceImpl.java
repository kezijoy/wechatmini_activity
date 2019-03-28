package com.jiaoke.activitywechatapplet.service.impl;

import com.jiaoke.activitywechatapplet.dao.ActivitySignMapper;
import com.jiaoke.activitywechatapplet.entity.ActivitySign;
import com.jiaoke.activitywechatapplet.service.ActivitySignService;
import com.jiaoke.activitywechatapplet.util.ResponseUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Author: Hongtao
 * @Date: 2019/3/27 15:58
 * @Description:
 */
@Service
public class ActivitySignServiceImpl implements ActivitySignService {

    @Resource
    private ActivitySignMapper activitySignMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Object signIn(int activityId, int userId) {
        ActivitySign activitySign1 = activitySignMapper.selectByActivityIdAndUserId(activityId, userId);
        if(activitySign1 == null){

            ActivitySign activitySign = new ActivitySign();
            activitySign.setActivityId(activityId);
            activitySign.setUserId(userId);
            activitySignMapper.insert(activitySign);
            return ResponseUtil.ok();
        }
        return ResponseUtil.fail();
    }

    @Override
    public String checkUserIsSign(int activityId, int userId) {
        ActivitySign activitySign = activitySignMapper.selectByActivityIdAndUserId(activityId, userId);
        if(activitySign != null){
            return "yes";
        }
        return "no";
    }
}
