package com.jiaoke.activitywechatapplet;

import com.jiaoke.activitywechatapplet.service.impl.ActivityServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ActivitywechatappletApplicationTests {

    @Autowired
    ActivityServiceImpl activityService;

    @Test
    public void contextLoads() {
        Date date = new Date();
        System.out.println(date);
    }


}
