package com.jiaoke.activitywechatapplet.dao;

import com.jiaoke.activitywechatapplet.entity.ActivitySign;
import com.jiaoke.activitywechatapplet.entity.ActivitySignExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivitySignMapper {
    long countByExample(ActivitySignExample example);

    int deleteByExample(ActivitySignExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivitySign record);

    int insertSelective(ActivitySign record);

    List<ActivitySign> selectByExample(ActivitySignExample example);

    ActivitySign selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivitySign record, @Param("example") ActivitySignExample example);

    int updateByExample(@Param("record") ActivitySign record, @Param("example") ActivitySignExample example);

    int updateByPrimaryKeySelective(ActivitySign record);

    int updateByPrimaryKey(ActivitySign record);

    ActivitySign selectByActivityIdAndUserId(@Param("activityId") int activityId,@Param("userId") int userId);

}