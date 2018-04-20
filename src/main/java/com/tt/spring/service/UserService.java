package com.tt.spring.service;

import com.tt.spring.entity.User;

import java.util.List;

public interface UserService {

    public List<User> listFindAll();
    public void insetInfoUser(User user);
    public void deleteIfoUser(User user);
    public void updateInfo(User user);

}
