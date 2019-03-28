package com.jiaoke.activitywechatapplet.service.impl;

import com.jiaoke.activitywechatapplet.dao.ActivityTypeCustomMapper;
import com.jiaoke.activitywechatapplet.entity.ActivityTypeCustom;
import com.jiaoke.activitywechatapplet.service.ActivityTypeCustomService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Hongtao
 * @Date: 2019/3/21 10:34
 * @Description:
 */
@Service
public class ActivityTypeCustomServiceImpl implements ActivityTypeCustomService {

    @Resource
    private ActivityTypeCustomMapper activityTypeCustomMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insert(ActivityTypeCustom activityTypeCustom) {
        activityTypeCustomMapper.insert(activityTypeCustom);
    }

    @Override
    public List<String> selectNameByActivityId(Integer id) {
        return activityTypeCustomMapper.selectNameByActivityId(id);
    }
}
