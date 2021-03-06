package com.tt.spring.entity;

import java.io.Serializable;

/**
 * @author Administrator
 */
public class User implements Serializable{
    private Integer id;
    private String username;
    private String password;
    private String interest;
    private String phone;
    private String email;
    private Integer age;
    private String mark;
    private String sexly;

    public User() {
    }

    public User(Integer id, String username, String password, String interest, String phone, String email, Integer age, String mark, String sexly) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.interest = interest;
        this.phone = phone;
        this.email = email;
        this.age = age;
        this.mark = mark;
        this.sexly = sexly;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getInterest() {
        return interest;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public String getMark() {
        return mark;
    }

    public String getSexly() {
        return sexly;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setSexly(String sexly) {
        this.sexly = sexly;
    }
}
