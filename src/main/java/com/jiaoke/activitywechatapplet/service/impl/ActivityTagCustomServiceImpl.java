package com.jiaoke.activitywechatapplet.service.impl;

import com.jiaoke.activitywechatapplet.dao.ActivityTagCustomMapper;
import com.jiaoke.activitywechatapplet.entity.ActivityTagCustom;
import com.jiaoke.activitywechatapplet.service.ActivityTagCustomService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Hongtao
 * @Date: 2019/3/21 10:39
 * @Description:
 */
@Service
public class ActivityTagCustomServiceImpl implements ActivityTagCustomService {

    @Resource
    private ActivityTagCustomMapper activityTagCustomMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insert(ActivityTagCustom activityTagCustom) {
        activityTagCustomMapper.insert(activityTagCustom);
    }

    @Override
    public List<String> selectNameByActivityId(Integer id) {
        return activityTagCustomMapper.selectNameByActivityId(id);
    }
}
