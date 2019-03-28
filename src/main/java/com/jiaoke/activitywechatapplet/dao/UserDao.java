package com.jiaoke.activitywechatapplet.dao;

import com.jiaoke.activitywechatapplet.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @Auther: Hongtao
 * @Date: 2019/3/13 17:51
 * @Description:
 */
@Repository
public interface UserDao {

    User test(String id);

    User queryByOpenId(String id);

    User queryByUserId(String id);

    int insertUser(User user);

    int updateUser(User user);
}
