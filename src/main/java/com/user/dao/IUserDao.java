package com.user.dao;

import com.user.model.User;

import java.util.List;

public interface IUserDao extends IGeneralDao<User>{
    void insertUser(User user);

    List<User> getByName(String name);

}
