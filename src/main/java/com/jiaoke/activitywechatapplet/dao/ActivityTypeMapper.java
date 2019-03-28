package com.jiaoke.activitywechatapplet.dao;

import com.jiaoke.activitywechatapplet.entity.ActivityType;
import com.jiaoke.activitywechatapplet.entity.ActivityTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityTypeMapper {
    long countByExample(ActivityTypeExample example);

    int deleteByExample(ActivityTypeExample example);

    int deleteByPrimaryKey(Integer activityTypeId);

    int insert(ActivityType record);

    int insertSelective(ActivityType record);

    List<ActivityType> selectByExample(ActivityTypeExample example);

    ActivityType selectByPrimaryKey(Integer activityTypeId);

    int updateByExampleSelective(@Param("record") ActivityType record, @Param("example") ActivityTypeExample example);

    int updateByExample(@Param("record") ActivityType record, @Param("example") ActivityTypeExample example);

    int updateByPrimaryKeySelective(ActivityType record);

    int updateByPrimaryKey(ActivityType record);

    List<ActivityType> selectAll();

}