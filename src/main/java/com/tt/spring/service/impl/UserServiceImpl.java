package com.tt.spring.service.impl;

import com.tt.spring.dao.UserDao;
import com.tt.spring.entity.User;
import com.tt.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> listFindAll() {

        return userDao.findAll();
    }

    @Override
    public void insetInfoUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public void deleteIfoUser(User user) {
        userDao.deleteUser(user);
    }

    @Override
    public void updateInfo(User user) {
        userDao.updateUserInfo(user);
    }

}
