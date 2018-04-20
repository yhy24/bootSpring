package com.tt.spring;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
@PropertySource("classpath:mybaties.properties")
public class DataSourceConfig {

    private String username;
    private String password;
    private String url;
    private String driverClassName;

    @Bean(name = "dataSource")
    public BasicDataSource dataSource(){
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
