package com.jiaoke.activitywechatapplet.dao;

import com.jiaoke.activitywechatapplet.entity.Activity;
import com.jiaoke.activitywechatapplet.entity.ActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityMapper {
    long countByExample(ActivityExample example);

    int deleteByExample(ActivityExample example);

    int deleteByPrimaryKey(Integer activityId);

    int insert(Activity record);

    int insertSelective(Activity record);

    List<Activity> selectByExample(ActivityExample example);

    Activity selectByPrimaryKey(Integer activityId);

    int updateByExampleSelective(@Param("record") Activity record, @Param("example") ActivityExample example);

    int updateByExample(@Param("record") Activity record, @Param("example") ActivityExample example);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);

    int selectMaxId();

    List<Activity> selectAll();

    List<Activity> selectByCreaterId (@Param("userId") Integer userId);

    List<Activity> selectByFollow(@Param("userId") Integer userId);

    List<Activity> selectByRegistration(@Param("userId") Integer userId);

    int updateStatusByActivityId(@Param("activityId") Integer activityId,@Param("activityStatus") String activityStatus);

    int updateStatusForRegistration();
    int updateStatusForPreparing();
    int updateStatusForProcessing();
    int updateStatusForEnd();
}