package com.tt.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Configuration
@Controller
/*这个配置会默认扫这个包下面的所有的子包*/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableScheduling
public class ControllerT {

    @RequestMapping("/app")
    @ResponseBody
    public String testBoot(){
        return "hello Word!";
    }

    public static void main(String[] args) {
        SpringApplication.run(ControllerT.class,args);
    }

}
