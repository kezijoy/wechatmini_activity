package com.jiaoke.activitywechatapplet.dao;

import com.jiaoke.activitywechatapplet.entity.ActivityTypeCustom;
import com.jiaoke.activitywechatapplet.entity.ActivityTypeCustomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityTypeCustomMapper {
    long countByExample(ActivityTypeCustomExample example);

    int deleteByExample(ActivityTypeCustomExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityTypeCustom record);

    int insertSelective(ActivityTypeCustom record);

    List<ActivityTypeCustom> selectByExample(ActivityTypeCustomExample example);

    ActivityTypeCustom selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityTypeCustom record, @Param("example") ActivityTypeCustomExample example);

    int updateByExample(@Param("record") ActivityTypeCustom record, @Param("example") ActivityTypeCustomExample example);

    int updateByPrimaryKeySelective(ActivityTypeCustom record);

    int updateByPrimaryKey(ActivityTypeCustom record);

    List<String> selectNameByActivityId(Integer id);

    int deleteByActivityId(Integer id);
}