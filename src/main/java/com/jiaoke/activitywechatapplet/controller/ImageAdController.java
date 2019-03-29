package com.jiaoke.activitywechatapplet.controller;

import com.jiaoke.activitywechatapplet.entity.ActivityImageAd;
import com.jiaoke.activitywechatapplet.service.ActivityImageAdService;
import com.jiaoke.activitywechatapplet.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Hongtao
 * @Date: 2019/3/28 17:17
 * @Description:
 */
@RestController
@RequestMapping("/wx/ad")
public class ImageAdController {

    @Autowired
    private ActivityImageAdService activityImageAdService;

    @PostMapping("/getAd")
    public Object getAd(){
        List<ActivityImageAd> activityImageAds = activityImageAdService.queryAll();
        return ResponseUtil.ok(activityImageAds);
    }
}
