package com.jiaoke.activitywechatapplet.dao;

import com.jiaoke.activitywechatapplet.entity.ActivityImage;
import com.jiaoke.activitywechatapplet.entity.ActivityImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityImageMapper {
    long countByExample(ActivityImageExample example);

    int deleteByExample(ActivityImageExample example);

    int deleteByPrimaryKey(Integer imageId);

    int insert(ActivityImage record);

    int insertSelective(ActivityImage record);

    List<ActivityImage> selectByExample(ActivityImageExample example);

    ActivityImage selectByPrimaryKey(Integer imageId);

    int updateByExampleSelective(@Param("record") ActivityImage record, @Param("example") ActivityImageExample example);

    int updateByExample(@Param("record") ActivityImage record, @Param("example") ActivityImageExample example);

    int updateByPrimaryKeySelective(ActivityImage record);

    int updateByPrimaryKey(ActivityImage record);

    List<String> selectUrlByActivityId(Integer id);

    int deleteByActivityId(Integer id);
}