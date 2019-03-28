package com.jiaoke.activitywechatapplet.dao;

import com.jiaoke.activitywechatapplet.entity.ActivityTagRelation;
import com.jiaoke.activitywechatapplet.entity.ActivityTagRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityTagRelationMapper {
    long countByExample(ActivityTagRelationExample example);

    int deleteByExample(ActivityTagRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityTagRelation record);

    int insertSelective(ActivityTagRelation record);

    List<ActivityTagRelation> selectByExample(ActivityTagRelationExample example);

    ActivityTagRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityTagRelation record, @Param("example") ActivityTagRelationExample example);

    int updateByExample(@Param("record") ActivityTagRelation record, @Param("example") ActivityTagRelationExample example);

    int updateByPrimaryKeySelective(ActivityTagRelation record);

    int updateByPrimaryKey(ActivityTagRelation record);

    List<String> selectTagByActivityId(Integer id);

    int deleteByActivityId(Integer id);
}