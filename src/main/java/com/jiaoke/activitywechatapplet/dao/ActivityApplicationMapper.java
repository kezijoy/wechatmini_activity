package com.jiaoke.activitywechatapplet.dao;

import com.jiaoke.activitywechatapplet.entity.ActivityApplication;
import com.jiaoke.activitywechatapplet.entity.ActivityApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityApplicationMapper {
    long countByExample(ActivityApplicationExample example);

    int deleteByExample(ActivityApplicationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityApplication record);

    int insertSelective(ActivityApplication record);

    List<ActivityApplication> selectByExample(ActivityApplicationExample example);

    ActivityApplication selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityApplication record, @Param("example") ActivityApplicationExample example);

    int updateByExample(@Param("record") ActivityApplication record, @Param("example") ActivityApplicationExample example);

    int updateByPrimaryKeySelective(ActivityApplication record);

    int updateByPrimaryKey(ActivityApplication record);

    ActivityApplication selectByActivityIdAndUserId(@Param("activityId") int activityId,@Param("userId") int userId);

    Object selectPerson(@Param("activityId") int activityId);

}