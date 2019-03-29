package com.jiaoke.activitywechatapplet.dao;

import com.jiaoke.activitywechatapplet.entity.ActivityImageAd;
import com.jiaoke.activitywechatapplet.entity.ActivityImageAdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityImageAdMapper {
    long countByExample(ActivityImageAdExample example);

    int deleteByExample(ActivityImageAdExample example);

    int deleteByPrimaryKey(Integer imageId);

    int insert(ActivityImageAd record);

    int insertSelective(ActivityImageAd record);

    List<ActivityImageAd> selectByExample(ActivityImageAdExample example);

    ActivityImageAd selectByPrimaryKey(Integer imageId);

    int updateByExampleSelective(@Param("record") ActivityImageAd record, @Param("example") ActivityImageAdExample example);

    int updateByExample(@Param("record") ActivityImageAd record, @Param("example") ActivityImageAdExample example);

    int updateByPrimaryKeySelective(ActivityImageAd record);

    int updateByPrimaryKey(ActivityImageAd record);

    List<ActivityImageAd> selectAll();
}