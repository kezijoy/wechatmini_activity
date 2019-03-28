package com.jiaoke.activitywechatapplet.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: Hongtao
 * @Date: 2019/3/25 09:40
 * @Description:
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Value("${web.upload-path}")
    private String path;

    /**
     * @Author hongtao
     * @Description  在D:/res/pic下如果有一张 luffy.jpg.jpg的图片，那么：
     *                1 访问：http://localhost:8080/img/luffy.jpg 可以访问到
     *                2 html 中 <img src="http://localhost:8080/img/luffy.jpg">
     * @Date 9:42 2019/3/25
     * @Param [registry]
     * @return void
     **/
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/img/**").addResourceLocations("file:" + path);
    }
}
