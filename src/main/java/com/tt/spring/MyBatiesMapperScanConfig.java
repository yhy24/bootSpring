package com.tt.spring;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*
* 用于扫描jdao接口的
*
* */
@Configuration
@AutoConfigureAfter(MyBatiesConfig.class)/*必须在获取连接池配置之后*/
public class MyBatiesMapperScanConfig {
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.tt.spring.dao");
        return mapperScannerConfigurer;
    }
}
