package com.tt.spring.dao;

import com.tt.spring.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    @Select("select * from user_info")
    public List<User> findAll();
    @Insert("insert into user_info(username,password,mark,age) values(#{username},#{password},#{mark},#{age})")
    public void insertUser(User user);
    @Delete("delete  from user_info where id=#{id}")
    public void deleteUser(User user);
    @Update("update user_info set sexly=#{sexly} where id=#{id}")
    public void updateUserInfo(User user);

}
