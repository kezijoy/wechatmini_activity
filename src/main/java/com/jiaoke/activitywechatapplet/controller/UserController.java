package com.jiaoke.activitywechatapplet.controller;

import com.alibaba.fastjson.JSONObject;
import com.jiaoke.activitywechatapplet.entity.Activity;
import com.jiaoke.activitywechatapplet.entity.User;
import com.jiaoke.activitywechatapplet.service.UserService;
import com.jiaoke.activitywechatapplet.util.ResponseUtil;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;

/**
 * @Author: Hongtao
 * @Date: 2019/3/13 17:56
 * @Description:
 */
@RestController
@RequestMapping("/wx/user")
public class UserController {

    @Value("${web.upload-path}")
    private String path;

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public User test(@RequestParam(value = "b")String b){
        System.out.println("q2"+b);
        System.out.println(userService.test(b));
        return userService.test(b);
    }

    @GetMapping("/queryUserInfoByUserId")
    public Object queryUserInfoByUserId(@RequestParam(value = "userId")String userId){
        User user = userService.queryByUserId(userId);
        if(user != null){
            return ResponseUtil.ok(user);
        }
        return ResponseUtil.fail();
    }

    @GetMapping("/updateUserInfo")
    public Object updateUserInfo( @RequestParam String userString){

        String inData = null;
        try {
            inData = URLDecoder.decode(URLDecoder.decode(userString, "UTF-8"), "UTF-8");
            User user = JSONObject.parseObject(inData, User.class);
            int i = userService.updateByUserId(user);
            if(i==1){
                return ResponseUtil.ok();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseUtil.fail();
    }

    @ResponseBody
    @RequestMapping("/upload")
    public Object upload(HttpServletRequest request, @RequestParam(value = "file", required = false) MultipartFile file) throws IOException {
        System.out.println("执行upload");
        request.setCharacterEncoding("UTF-8");
        logger.info("执行图片上传");

        if(!file.isEmpty()) {
            logger.info("成功获取照片");
            String fileName = file.getOriginalFilename();
            String realPath = null;
            String type = null;
            type = fileName.indexOf(".") != -1 ? fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length()) : null;
            logger.info("图片初始名称为：" + fileName + " 类型为：" + type);
            if (type != null) {

                    // 项目在容器中实际发布运行的根路径
                    //String realPath = request.getSession().getServletContext().getRealPath("/");
                    // 自定义的文件名称
                    String trueFileName = String.valueOf(System.currentTimeMillis()) + fileName;
                    // 设置存放图片文件的路径
                    realPath = path + trueFileName;
                    logger.info("存放图片文件的路径:" + realPath);
                    file.transferTo(new File(realPath));
                    logger.info("文件成功上传到指定目录下");
                    return ResponseUtil.ok(trueFileName);

            }else {
                logger.info("文件类型为空");
                return ResponseUtil.fail();
            }
        }else {
            logger.info("没有找到相对应的文件");
            return ResponseUtil.fail();
        }
    }

}
