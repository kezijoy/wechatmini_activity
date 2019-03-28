package com.jiaoke.activitywechatapplet.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiaoke.activitywechatapplet.controller.UserController;
import com.jiaoke.activitywechatapplet.dao.*;
import com.jiaoke.activitywechatapplet.entity.*;
import com.jiaoke.activitywechatapplet.service.*;
import com.jiaoke.activitywechatapplet.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.*;

/**
 * @Author: Hongtao
 * @Date: 2019/3/19 13:25
 * @Description:
 */
@Service
public class ActivityServiceImpl implements ActivityService {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource
    private ActivityMapper activityMapper;
    @Autowired
    private ActivityTypeRelationMapper activityTypeRelationMapper;
    @Autowired
    private ActivityTagRelationMapper activityTagRelationMapper;
    @Autowired
    private ActivityImageMapper activityImageMapper;
    @Autowired
    private ActivityVideoMapper activityVideoMapper;
    @Resource
    private ActivityTypeCustomMapper activityTypeCustomMapper;
    @Resource
    private ActivityTagCustomMapper activityTagCustomMapper;
    @Resource
    private ActivityApplicationService activityApplicationService;
    @Autowired
    private ActivityFollowService activityFollowService;
    @Autowired
    private ActivityLikeService activityLikeService;
    @Autowired
    private ActivitySignService activitySignService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Object addActivity(Activity activity,String typeIds,String tagIds, String imgUrl, String videoUrl, String selfTypes, String selfTags) {
        activityMapper.insert(activity);
        int id = activityMapper.selectMaxId() - 1;

        addActivityIRelationData(typeIds, tagIds, imgUrl, videoUrl, selfTypes, selfTags, id);

        return ResponseUtil.ok(id);
    }

    @Override
    public Object selectById(int id,int userId) {

        Map<Object, Object> result = new HashMap<Object, Object>();
        Activity activity = activityMapper.selectByPrimaryKey(id);
        if(activity != null){
            Integer activityId = activity.getActivityId();
            List<String> activityType = getActivityType(activityId);
            List<String> activityTag = getActivityTag(activityId);
            List<String> imgUrl = activityImageMapper.selectUrlByActivityId(activityId);
            List<String> videoUrl = activityVideoMapper.selectUrlByActivityId(activityId);
            logger.info("活动类型（包含自定义）："+activityType.toString());
            logger.info("活动标签（包含自定义）："+activityTag.toString());
            result.put("activity",activity);
            result.put("activityType",activityType);
            result.put("activityTag",activityTag);
            result.put("imgUrl",imgUrl);
            result.put("videoUrl",videoUrl);
            /*查询是否报名*/
            String isRegistration = activityApplicationService.checkUserIsRegistration(id, userId);
            String isFollow = activityFollowService.checkUserIsFollow(id, userId);
            String isLike = activityLikeService.checkUserIsLike(id, userId);
            int personNum = activityApplicationService.queryPersonNum(id);
            String isSign = activitySignService.checkUserIsSign(id, userId);
            result.put("isRegistration",isRegistration);
            result.put("isFollow",isFollow);
            result.put("isLike",isLike);
            result.put("personNum",personNum);
            result.put("isSign",isSign);
            return ResponseUtil.ok(result);
        }
        return ResponseUtil.fail();

    }

    @Override
    public int selectMaxId() {
        return activityMapper.selectMaxId();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Object updateActivity(Activity activity, String typeIds, String tagIds, String imgUrl, String videoUrl, String selfTypes, String selfTags) {
        int i = activityMapper.updateByPrimaryKeySelective(activity);
        System.out.println(i);
        Integer id = activity.getActivityId();
        System.out.println(id);
        /**
         * typeIds和selfTypes都为空时，代表只是更新用户状态
         */
        if(typeIds.length()>0 ||selfTypes.length()>0){

            activityTypeRelationMapper.deleteByActivityId(id);
            activityTagRelationMapper.deleteByActivityId(id);
            activityTypeCustomMapper.deleteByActivityId(id);
            activityTagCustomMapper.deleteByActivityId(id);
            activityImageMapper.deleteByActivityId(id);
            activityVideoMapper.deleteByActivityId(id);

            addActivityIRelationData(typeIds, tagIds, imgUrl, videoUrl, selfTypes, selfTags, id);
        }

        return ResponseUtil.ok(id);
    }

    @Override
    public Object selectAll(int pageNum, int pageSize) {
        Map<Object, Object> result = new HashMap<Object, Object>();
        PageHelper.startPage(pageNum,pageSize);
        List<Activity> activityList = activityMapper.selectAll();
        PageInfo<Activity> activityPageInfo = new PageInfo<>(activityList);
        long total = activityPageInfo.getTotal();
        //System.out.println(total);
        result.put("activityList",activityList);
        result.put("total",total);
        return ResponseUtil.ok(result);
    }

    @Override
    public List<Activity> queryByCreatorId(int userId) {
        return activityMapper.selectByCreaterId(userId);
    }

    @Override
    public List<Activity> queryByFollow(int userId) {
        return activityMapper.selectByFollow(userId);
    }

    @Override
    public List<Activity> queryByApplication(int userId) {
        return activityMapper.selectByRegistration(userId);
    }

    /**
     * @Author hongtao
     * @Description 更改用户状态
     * @Date 11:11 2019/3/27
     * @Param [activityId, activityStatus]
     * @return void
     **/
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateActivityStatus(Integer activityId, String activityStatus) {
        activityMapper.updateStatusByActivityId(activityId,activityStatus);
    }

    /**
     * @Author hongtao
     * @Description 添加与活动相关的信息
     * @Date 16:19 2019/3/21
     * @Param [typeIds 活动类型, tagIds 活动标签, imgUrl 图片, videoUrl 视频, selfTypes 自定义活动类型, selfTags 自定义活动标签, id 活动id]
     * @return void
     **/
    private void addActivityIRelationData(String typeIds, String tagIds, String imgUrl, String videoUrl, String selfTypes, String selfTags, int id) {
        String[] typeIdArr = null;
        String[] tagIdArr = null;

        if(typeIds.length()>0){
            typeIdArr = typeIds.split(",");
        }
        if(tagIds.length()>0){
            tagIdArr = tagIds.split(",");
        }
        String[] imgArr = null;
        if(imgUrl.length()>0){
            imgArr = imgUrl.split(",");
        }
        String[] videoArr = null;
        if(videoUrl.length()>0){
            videoArr = videoUrl.split(",");
        }
        String[] selfTypeArr = null;
        if(selfTypes.length()>0){
            selfTypeArr = selfTypes.split(",");
        }
        String[] selfTagArr = null;
        if(selfTags.length()>0){
            selfTagArr = selfTags.split(",");
        }
        logger.info("类型id"+ Arrays.toString(typeIdArr));
        logger.info("标签id"+Arrays.toString(tagIdArr));
        logger.info("自定义类型"+Arrays.toString(selfTypeArr));
        logger.info("自定义标签"+Arrays.toString(selfTagArr));

        /*活动类型关系表*/
        if(typeIdArr != null && typeIdArr.length > 0){
            ActivityTypeRelation activityTypeRelation = new ActivityTypeRelation();
            activityTypeRelation.setActivityId(id);
            for (int i = 0; i < typeIdArr.length; i++) {
                activityTypeRelation.setActivityTypeId(Integer.valueOf(typeIdArr[i]));
                activityTypeRelationMapper.insert(activityTypeRelation);
            }
        }
        /*活动标签关系表*/
        if(tagIdArr != null && tagIdArr.length > 0){
            ActivityTagRelation activityTagRelation = new ActivityTagRelation();
            activityTagRelation.setActivityId(id);
            for (int i = 0; i < tagIdArr.length; i++) {
                activityTagRelation.setActivityTagId(Integer.valueOf(tagIdArr[i]));
                activityTagRelationMapper.insert(activityTagRelation);
            }
        }
        /*图片表*/
        if(imgArr != null && imgArr.length > 0){
            ActivityImage activityImage = new ActivityImage();
            activityImage.setActivityId(id);
            for (int i = 0; i < imgArr.length; i++) {
                activityImage.setImageUrl(imgArr[i]);
                activityImageMapper.insert(activityImage);
            }
        }
        /*视频表*/
        if(videoArr != null && videoArr.length > 0){
            ActivityVideo activityVideo = new ActivityVideo();
            activityVideo.setActivityId(id);
            for (int i = 0; i < videoArr.length; i++) {
                activityVideo.setVideoUrl(videoArr[i]);
                activityVideoMapper.insert(activityVideo);
            }
        }
        /*活动类型自定义*/
        if(selfTypeArr != null && selfTypeArr.length > 0){
            ActivityTypeCustom activityTypeCustom = new ActivityTypeCustom();
            activityTypeCustom.setActivityId(id);
            for (int i = 0; i < selfTypeArr.length; i++) {
                activityTypeCustom.setName(selfTypeArr[i]);
                activityTypeCustomMapper.insert(activityTypeCustom);
            }
        }
        /*活动标签自定义*/
        if(selfTagArr != null && selfTagArr.length > 0){
            ActivityTagCustom activityTagCustom = new ActivityTagCustom();
            activityTagCustom.setActivityId(id);
            for (int i = 0; i < selfTagArr.length; i++) {
                activityTagCustom.setName(selfTagArr[i]);
                activityTagCustomMapper.insert(activityTagCustom);
            }
        }
    }

    public List<String> getActivityType(Integer activityId){
        List<String> list = new ArrayList<>();
        /*根据activityId获取typeId集合 再根据typeId获取typeName*/
        list = activityTypeRelationMapper.selectTypeByActivityId(activityId);
        List<String> customTypeList = activityTypeCustomMapper.selectNameByActivityId(activityId);
        if(customTypeList != null && !customTypeList.isEmpty()){

            list.addAll(customTypeList);
        }
        return list;
    }

    public List<String> getActivityTag(Integer activityId){
        List<String> list = new ArrayList<>();
        list = activityTagRelationMapper.selectTagByActivityId(activityId);
        List<String> customTagList = activityTagCustomMapper.selectNameByActivityId(activityId);
        if(customTagList != null && !customTagList.isEmpty()){

            list.addAll(customTagList);
        }
        return list;
    }


}
