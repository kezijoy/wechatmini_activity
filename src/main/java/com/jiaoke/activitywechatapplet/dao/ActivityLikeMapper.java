package com.jiaoke.activitywechatapplet.dao;

import com.jiaoke.activitywechatapplet.entity.ActivityLike;
import com.jiaoke.activitywechatapplet.entity.ActivityLikeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityLikeMapper {
    long countByExample(ActivityLikeExample example);

    int deleteByExample(ActivityLikeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityLike record);

    int insertSelective(ActivityLike record);

    List<ActivityLike> selectByExample(ActivityLikeExample example);

    ActivityLike selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityLike record, @Param("example") ActivityLikeExample example);

    int updateByExample(@Param("record") ActivityLike record, @Param("example") ActivityLikeExample example);

    int updateByPrimaryKeySelective(ActivityLike record);

    int updateByPrimaryKey(ActivityLike record);

    int deleteByActivityIdAndUserId (@Param("activityId") int activityId,@Param("userId") int userId);

    ActivityLike selectByActivityIdAndUserId(@Param("activityId") int activityId, @Param("userId") int userId);
}