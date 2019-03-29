package com.jiaoke.activitywechatapplet.controller;

import com.alibaba.fastjson.JSONObject;
import com.jiaoke.activitywechatapplet.entity.Activity;
import com.jiaoke.activitywechatapplet.entity.ActivityTag;
import com.jiaoke.activitywechatapplet.entity.ActivityType;
import com.jiaoke.activitywechatapplet.service.*;
import com.jiaoke.activitywechatapplet.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Hongtao
 * @Date: 2019/3/19 13:31
 * @Description:
 */
@RestController
@RequestMapping("/wx/activity")
public class ActivityController {

    private Logger logger = LoggerFactory.getLogger(ActivityController.class);

    @Autowired
    private ActivityService activityService;

    @Autowired
    private ActivityTypeService activityTypeService;

    @Autowired
    private ActivityTagService activityTagService;

    @Autowired
    private ActivityTypeCustomService activityTypeCustomService;

    @Autowired
    private ActivityTagCustomService activityTagCustomService;

    @Autowired
    private ActivityApplicationService activityApplicationService;

    @Autowired
    private ActivityFollowService activityFollowService;

    @Autowired
    private ActivityLikeService activityLikeService;

    @Autowired
    private ActivityCommentService activityCommentService;

    @Autowired
    private ActivitySignService activitySignService;

    @PostMapping("/info")
    public Object info(){
        Map<Object, Object> result = new HashMap<Object, Object>();
        List<ActivityType> activityTypes = activityTypeService.selectAll();
        List<ActivityTag> activityTags = activityTagService.selectAll();
        result.put("types",activityTypes);
        result.put("tags",activityTags);
        return ResponseUtil.ok(result);
    }

    /**
     * @Author hongtao
     * @Description 添加活动
     * @Date 16:17 2019/3/21
     * @Param [str, typeIds, tagIds, imgUrl, videoUrl, selfTypes, selfTags]
     * @return java.lang.Object
     **/
    @PostMapping("/addActivity")
    public Object addActivity(@RequestParam String str,@RequestParam String typeIds,@RequestParam String tagIds,
                              @RequestParam String imgUrl,@RequestParam String videoUrl,@RequestParam String selfTypes,@RequestParam String selfTags){

        try {
            String inData = URLDecoder.decode(URLDecoder.decode(str, "UTF-8"), "UTF-8");
            logger.info("新建活动信息："+inData);
            JSONObject json = JSONObject.parseObject(inData);
            System.out.println(json);
            Activity activity = JSONObject.parseObject(inData, Activity.class);
            System.out.println(activity);
            return activityService.addActivity(activity,typeIds,tagIds,imgUrl,videoUrl,selfTypes,selfTags);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return ResponseUtil.fail();
    }

    /**
     * @Author hongtao
     * @Description 编辑活动信息
     * @Date 15:53 2019/3/21
     * @Param [str, typeIds, tagIds, imgUrl, videoUrl, selfTypes, selfTags]
     * @return java.lang.Object
     **/
    @PostMapping("/updateActivity")
    public Object updateActivity(@RequestParam String str,@RequestParam String typeIds,@RequestParam String tagIds,
                                 @RequestParam String imgUrl,@RequestParam String videoUrl,@RequestParam String selfTypes,
                                 @RequestParam String selfTags){

        try {
            String inData = URLDecoder.decode(URLDecoder.decode(str, "UTF-8"), "UTF-8");
            logger.info("修改活动信息："+inData);
            JSONObject json = JSONObject.parseObject(inData);
            System.out.println(json);
            Activity activity = JSONObject.parseObject(inData, Activity.class);
            System.out.println("活动实体类："+activity);
            return activityService.updateActivity(activity,typeIds,tagIds,imgUrl,videoUrl,selfTypes,selfTags);


        } catch (Exception e) {
            e.printStackTrace();
        }

        return ResponseUtil.fail();
    }

    /**
     * @Author hongtao
     * @Description 根据id获取活动详情
     * @Date 16:18 2019/3/21
     * @Param [id]
     * @return java.lang.Object
     **/
    @PostMapping("/queryById")
    public Object queryById(@RequestParam int id,@RequestParam int userId){

        return activityService.selectById(id,userId);
    }

    /**
     * @Author hongtao
     * @Description 查询系统提供的活动类型和活动类别
     * @Date 15:29 2019/3/21
     * @Param [id] 活动id
     * @return java.lang.Object
     **/
    @PostMapping("/infoForEdit")
    public Object infoByActivityId(@RequestParam String id){
        Map<Object, Object> result = new HashMap<Object, Object>();
        List<ActivityType> activityTypes = activityTypeService.selectAll();
        List<ActivityTag> activityTags = activityTagService.selectAll();
        List<String> selfTypes = activityTypeCustomService.selectNameByActivityId(Integer.valueOf(id));
        List<String> selfTags = activityTagCustomService.selectNameByActivityId(Integer.valueOf(id));
        result.put("types",activityTypes);
        result.put("tags",activityTags);
        result.put("selfTypes",selfTypes);
        result.put("selfTags",selfTags);
        return ResponseUtil.ok(result);
    }

    /**
     * @Author hongtao
     * @Description 小程序首页查询所有活动接口
     * @Date 14:26 2019/3/22
     * @Param [pageNum, pageSize]
     * @return java.lang.Object
     **/
    @PostMapping("/queryAll")
    public Object queryAll(@RequestParam int pageNum,@RequestParam int pageSize){

        return activityService.selectAll(pageNum,pageSize);
    }

    /**
     * @Author hongtao
     * @Description 活动报名接口
     * @Date 15:56 2019/3/22
     * @Param [activityId, userId]
     * @return java.lang.Object
     **/
    @PostMapping("/registrationActivity")
    public Object registrationActivity(@RequestParam int activityId,@RequestParam int userId,@RequestParam int person,@RequestParam String note){


        return activityApplicationService.registrationActivity(activityId,userId,person,note);
    }

    /**
     * @Author hongtao
     * @Description 关注活动接口
     * @Date 16:12 2019/3/27
     * @Param [activityId, userId]
     * @return java.lang.Object
     **/
    @PostMapping("/followActivity")
    public Object followActivity(@RequestParam int activityId,@RequestParam int userId){

        activityFollowService.followActivity(activityId,userId);
        return ResponseUtil.ok();
    }

    /**
     * @Author hongtao
     * @Description 取消关注活动接口
     * @Date 16:12 2019/3/27
     * @Param [activityId, userId]
     * @return java.lang.Object
     **/
    @PostMapping("/cancleFollow")
    public Object cancelFollow(@RequestParam int activityId,@RequestParam int userId){

        activityFollowService.cancelFollow(activityId,userId);
        return ResponseUtil.ok();
    }

    /**
     * @Author hongtao
     * @Description 查询“我组织的活动”
     * @Date 16:13 2019/3/27
     * @Param [userId]
     * @return java.lang.Object
     **/
    @PostMapping("/queryByCreaterId")
    public Object queryByCreaterId(@RequestParam int userId){
        Map<Object, Object> result = new HashMap<Object, Object>();
        List<Activity> activityList = activityService.queryByCreatorId(userId);
        result.put("activityList",activityList);
        return ResponseUtil.ok(result);
    }

    /**
     * @Author hongtao
     * @Description 查询“我关注的活动”
     * @Date 16:14 2019/3/27
     * @Param [userId]
     * @return java.lang.Object
     **/
    @PostMapping("/queryFollow")
    public Object queryFollow(@RequestParam int userId){
        Map<Object, Object> result = new HashMap<Object, Object>();
        List<Activity> activitiyList = activityService.queryByFollow(userId);
        result.put("activityList",activitiyList);
        return ResponseUtil.ok(result);
    }

    /**
     * @Author hongtao
     * @Description 查询“我参与的活动”
     * @Date 16:14 2019/3/27
     * @Param [userId]
     * @return java.lang.Object
     **/
    @PostMapping("/queryApplication")
    public Object queryApplication(@RequestParam int userId){
        Map<Object, Object> result = new HashMap<Object, Object>();
        List<Activity> activitiyList = activityService.queryByApplication(userId);
        result.put("activityList",activitiyList);
        return ResponseUtil.ok(result);
    }

    /**
     * @Author hongtao
     * @Description 点赞活动接口
     * @Date 16:15 2019/3/27
     * @Param [activityId, userId]
     * @return java.lang.Object
     **/
    @PostMapping("/likeActivity")
    public Object likeActivity(@RequestParam int activityId,@RequestParam int userId){

        activityLikeService.likeActivity(activityId,userId);
        return ResponseUtil.ok();
    }

    /**
     * @Author hongtao
     * @Description 取消点赞活动接口
     * @Date 16:16 2019/3/27
     * @Param [activityId, userId]
     * @return java.lang.Object
     **/
    @PostMapping("/cancelLike")
    public Object cancelLike(@RequestParam int activityId,@RequestParam int userId){

        activityLikeService.cancelLike(activityId,userId);
        return ResponseUtil.ok();
    }

    /**
     * @Author hongtao
     * @Description 活动评论接口
     * @Date 16:16 2019/3/27
     * @Param [activityId, userId, content]
     * @return java.lang.Object
     **/
    @PostMapping("/commentActivity")
    public Object commentActivity(@RequestParam int activityId,@RequestParam int userId,@RequestParam String content){

        activityCommentService.commentActivity(activityId,userId,content);
        return ResponseUtil.ok();
    }

    /**
     * @Author hongtao
     * @Description 查询活动所有评论
     * @Date 16:17 2019/3/27
     * @Param [activityId]
     * @return java.lang.Object
     **/
    @PostMapping("/queryComment")
    public Object queryComment(@RequestParam int activityId){
        Map<Object, Object> result = new HashMap<Object, Object>();
        List<Map<String, Object>> comment = activityCommentService.queryComment(activityId);
        return ResponseUtil.ok(comment);
    }

    /**
     * @Author hongtao
     * @Description 更改活动状态接口
     * @Date 16:17 2019/3/27
     * @Param [activityId, status]
     * @return java.lang.Object
     **/
    @PostMapping("/modifyStatus")
    public Object modifyStatus(@RequestParam int activityId,@RequestParam String status){
        activityService.updateActivityStatus(activityId,status);
        return ResponseUtil.ok();
    }

    /**
     * @Author hongtao
     * @Description
     * @Date 16:35 2019/3/27
     * @Param [activityId, userId]
     * @return java.lang.Object
     **/
    @PostMapping("/signActivity")
    public Object signActivity(@RequestParam int activityId,@RequestParam int userId){
        return activitySignService.signIn(activityId, userId);
    }

}
