package com.jiaoke.activitywechatapplet.service;

import com.jiaoke.activitywechatapplet.entity.User;

/**
 * @Auther: Hongtao
 * @Date: 2019/3/14 16:03
 * @Description:
 */
public interface UserService {
    User test(String id);

    public User queryByOpenId(String id);

    public void addUser(User user);

    public User queryByUserId(String id);

    public int updateByUserId(User user);
}
