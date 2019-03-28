package com.jiaoke.activitywechatapplet.dao;

import com.jiaoke.activitywechatapplet.entity.ActivityVideo;
import com.jiaoke.activitywechatapplet.entity.ActivityVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityVideoMapper {
    long countByExample(ActivityVideoExample example);

    int deleteByExample(ActivityVideoExample example);

    int deleteByPrimaryKey(Integer videoId);

    int insert(ActivityVideo record);

    int insertSelective(ActivityVideo record);

    List<ActivityVideo> selectByExample(ActivityVideoExample example);

    ActivityVideo selectByPrimaryKey(Integer videoId);

    int updateByExampleSelective(@Param("record") ActivityVideo record, @Param("example") ActivityVideoExample example);

    int updateByExample(@Param("record") ActivityVideo record, @Param("example") ActivityVideoExample example);

    int updateByPrimaryKeySelective(ActivityVideo record);

    int updateByPrimaryKey(ActivityVideo record);

    List<String> selectUrlByActivityId(Integer id);

    int deleteByActivityId(Integer id);
}