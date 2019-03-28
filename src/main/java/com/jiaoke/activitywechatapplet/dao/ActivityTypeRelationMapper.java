package com.jiaoke.activitywechatapplet.dao;

import com.jiaoke.activitywechatapplet.entity.ActivityTypeRelation;
import com.jiaoke.activitywechatapplet.entity.ActivityTypeRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityTypeRelationMapper {
    long countByExample(ActivityTypeRelationExample example);

    int deleteByExample(ActivityTypeRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityTypeRelation record);

    int insertSelective(ActivityTypeRelation record);

    List<ActivityTypeRelation> selectByExample(ActivityTypeRelationExample example);

    ActivityTypeRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityTypeRelation record, @Param("example") ActivityTypeRelationExample example);

    int updateByExample(@Param("record") ActivityTypeRelation record, @Param("example") ActivityTypeRelationExample example);

    int updateByPrimaryKeySelective(ActivityTypeRelation record);

    int updateByPrimaryKey(ActivityTypeRelation record);

    List<String> selectTypeByActivityId(Integer id);

    int deleteByActivityId(Integer id);
}