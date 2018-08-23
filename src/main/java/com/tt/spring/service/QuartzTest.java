package com.tt.spring.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author: yhy
 * @Date: 2018/8/23 17:35
 * @Version 1.0
 */
@Component
public class QuartzTest {

    @Scheduled(fixedRate = 5000)
    public void test() {
        System.out.println("-----Scheduled------");
    }



}
