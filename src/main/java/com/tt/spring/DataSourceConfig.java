package com.tt.spring;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration/*这个必须要的要扫面这个类*/
@ConfigurationProperties(prefix = "spring.datasource")/*配置的前缀*/
@PropertySource("classpath:mybaties.properties")/*这个扫描这个配置文件*/
public class DataSourceConfig {
    /*这些名字的字段属性必须和配置文件中的后缀的名字相同*/
    private String username;
    private String password;
    private String url;
    private String driverClassName;

    @Bean(name = "dataSource")
    public BasicDataSource dataSource(){
        /*一些简单的配置属性*/
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
      dataSource.setDriverClassName(driverClassName);
        return dataSource;
    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }
}
