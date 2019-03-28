package com.jiaoke.activitywechatapplet.service.impl;

import com.jiaoke.activitywechatapplet.dao.ActivityApplicationMapper;
import com.jiaoke.activitywechatapplet.dao.ActivityMapper;
import com.jiaoke.activitywechatapplet.entity.Activity;
import com.jiaoke.activitywechatapplet.entity.ActivityApplication;
import com.jiaoke.activitywechatapplet.service.ActivityApplicationService;
import com.jiaoke.activitywechatapplet.util.ResponseUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @Author: Hongtao
 * @Date: 2019/3/22 14:46
 * @Description:
 */
@Service
public class ActivityApplicationServiceImpl implements ActivityApplicationService {

    @Resource
    private ActivityApplicationMapper activityApplicationMapper;

    @Resource
    private ActivityMapper activityMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Object registrationActivity(int activityId, int userId,int person,String note) {
        ActivityApplication activityApplication = new ActivityApplication();
        activityApplication.setActivityId(activityId);
        activityApplication.setUserId(userId);
        activityApplication.setPerson(person);
        activityApplication.setNote(note);
        Date date = new Date();
        activityApplication.setCreateTime(date);

        Activity activity = activityMapper.selectByPrimaryKey(activityId);
        Date registrationStartTime = activity.getRegistrationStartTime();
        Date registrationEndTime = activity.getRegistrationEndTime();
        if(date.before(registrationEndTime) && date.after(registrationStartTime)){

            activityApplicationMapper.insert(activityApplication);
            return ResponseUtil.ok();
        }
        return ResponseUtil.fail();
    }

    @Override
    public String checkUserIsRegistration(int activityId, int userId) {
        ActivityApplication activityApplication = activityApplicationMapper.selectByActivityIdAndUserId(activityId, userId);
        if(activityApplication != null){
            return "yes";
        }
        return "no";
    }

    @Override
    public int queryPersonNum(int activityId) {
        Object num = activityApplicationMapper.selectPerson(activityId);
        if(num == null){
            return 0;
        }
        return Integer.parseInt(num.toString());
    }
}
