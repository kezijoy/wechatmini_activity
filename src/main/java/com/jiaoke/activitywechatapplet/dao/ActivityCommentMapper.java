package com.jiaoke.activitywechatapplet.dao;

import com.jiaoke.activitywechatapplet.entity.ActivityComment;
import com.jiaoke.activitywechatapplet.entity.ActivityCommentExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ActivityCommentMapper {
    long countByExample(ActivityCommentExample example);

    int deleteByExample(ActivityCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityComment record);

    int insertSelective(ActivityComment record);

    List<ActivityComment> selectByExample(ActivityCommentExample example);

    ActivityComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityComment record, @Param("example") ActivityCommentExample example);

    int updateByExample(@Param("record") ActivityComment record, @Param("example") ActivityCommentExample example);

    int updateByPrimaryKeySelective(ActivityComment record);

    int updateByPrimaryKey(ActivityComment record);

    List<Map<String,Object>> selectByActivityId(Integer activityId);
}