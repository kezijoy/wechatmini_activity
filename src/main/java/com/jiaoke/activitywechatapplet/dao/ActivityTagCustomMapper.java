package com.jiaoke.activitywechatapplet.dao;

import com.jiaoke.activitywechatapplet.entity.ActivityTagCustom;
import com.jiaoke.activitywechatapplet.entity.ActivityTagCustomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityTagCustomMapper {
    long countByExample(ActivityTagCustomExample example);

    int deleteByExample(ActivityTagCustomExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityTagCustom record);

    int insertSelective(ActivityTagCustom record);

    List<ActivityTagCustom> selectByExample(ActivityTagCustomExample example);

    ActivityTagCustom selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityTagCustom record, @Param("example") ActivityTagCustomExample example);

    int updateByExample(@Param("record") ActivityTagCustom record, @Param("example") ActivityTagCustomExample example);

    int updateByPrimaryKeySelective(ActivityTagCustom record);

    int updateByPrimaryKey(ActivityTagCustom record);

    List<String> selectNameByActivityId(Integer id);

    int deleteByActivityId(Integer id);
}