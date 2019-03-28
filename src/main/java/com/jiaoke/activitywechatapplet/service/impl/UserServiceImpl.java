package com.jiaoke.activitywechatapplet.service.impl;

import com.jiaoke.activitywechatapplet.dao.UserDao;
import com.jiaoke.activitywechatapplet.entity.User;
import com.jiaoke.activitywechatapplet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Auther: Hongtao
 * @Date: 2019/3/14 16:05
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User test(String id) {
        return userDao.test(id);
    }

    @Override
    public User queryByOpenId(String id) {
        return userDao.queryByOpenId(id);
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public User queryByUserId(String id) {
        return userDao.queryByUserId(id);
    }

    @Override
    @Transactional
    public int updateByUserId(User user) {
        return userDao.updateUser(user);
    }
}
