package com.jiaoke.activitywechatapplet.controller;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import com.alibaba.fastjson.JSONObject;
import com.jiaoke.activitywechatapplet.entity.User;
import com.jiaoke.activitywechatapplet.entity.UserInfo;
import com.jiaoke.activitywechatapplet.service.UserService;
import com.jiaoke.activitywechatapplet.util.ResponseUtil;
import me.chanjar.weixin.common.error.WxErrorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: Hongtao
 * @Date: 2019/3/15 14:31
 * @Description:
 */
@RestController
@RequestMapping("/wx/auth")
public class WxLoginController {

    @Autowired
    private WxMaService wxService;

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public Object test(String code){
        System.out.println("wwwwwww");
        System.out.println(code);
        return 1;
    }

    @GetMapping("/getOpenId")
    public Object getOpenId(@RequestParam(value = "code") String code){
        String sessionKey = null;
        String openId = null;
        try {
            WxMaJscode2SessionResult result = this.wxService.getUserService().getSessionInfo(code);
            sessionKey = result.getSessionKey();
            openId = result.getOpenid();
            System.out.println("session"+sessionKey);
            System.out.println("open"+openId);
        } catch (WxErrorException e) {
            e.printStackTrace();
        }
        Map<Object, Object> result = new HashMap<Object, Object>();
        result.put("sessionKey", sessionKey);
        result.put("openId", openId);
        return ResponseUtil.ok(result);
    }

    @GetMapping("/login")
    public Object login(@RequestParam(value = "openId") String openId){

        User user = userService.queryByOpenId(openId);

        return ResponseUtil.ok(user.getUserId());
    }

    @GetMapping("/createAndLogin")
    public Object createAndLogin(@RequestParam String openId, @RequestParam String userString){

        try {
            String inData = URLDecoder.decode(URLDecoder.decode(userString, "UTF-8"), "UTF-8");

            UserInfo userInfo = JSONObject.parseObject(inData, UserInfo.class);
            User user = userService.queryByOpenId(openId);
            if(user == null){
                user = new User();
                user.setNickName(userInfo.getNickName());
                user.setOpenId(openId);
                user.setAvatarUrl(userInfo.getAvatarUrl());
                user.setGender(userInfo.getGender());
                user.setProvince(userInfo.getProvince());
                user.setCity(userInfo.getCity());
                user.setCountry(userInfo.getCountry());

                userService.addUser(user);

                user = userService.queryByOpenId(openId);
                System.out.println("1111"+user);
                return ResponseUtil.ok(user.getUserId());
            }else {
                return ResponseUtil.ok(user.getUserId());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseUtil.fail();
    }
}
