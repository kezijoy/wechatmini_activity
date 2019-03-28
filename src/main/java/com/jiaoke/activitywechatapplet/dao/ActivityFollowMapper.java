package com.jiaoke.activitywechatapplet.dao;

import com.jiaoke.activitywechatapplet.entity.ActivityFollow;
import com.jiaoke.activitywechatapplet.entity.ActivityFollowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityFollowMapper {
    long countByExample(ActivityFollowExample example);

    int deleteByExample(ActivityFollowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityFollow record);

    int insertSelective(ActivityFollow record);

    List<ActivityFollow> selectByExample(ActivityFollowExample example);

    ActivityFollow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityFollow record, @Param("example") ActivityFollowExample example);

    int updateByExample(@Param("record") ActivityFollow record, @Param("example") ActivityFollowExample example);

    int updateByPrimaryKeySelective(ActivityFollow record);

    int updateByPrimaryKey(ActivityFollow record);

    int deleteByActivityIdAndUserId (@Param("activityId") int activityId,@Param("userId") int userId);

    ActivityFollow selectByActivityIdAndUserId(@Param("activityId") int activityId,@Param("userId") int userId);
}