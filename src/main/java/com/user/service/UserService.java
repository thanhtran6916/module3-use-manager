package com.user.service;

import com.user.dao.IUserDao;
import com.user.dao.UserDao;
import com.user.model.User;

import java.util.List;

public class UserService implements IUserService {
    IUserDao userDao = new UserDao();

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public boolean save(User user) {
        return false;
    }

    @Override
    public boolean update(int id, User user) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public User findById(int id) {
        User user = userDao.findById(id);
        return user;
    }

    @Override
    public List<User> getByName(String name) {
        name = "%" + name + "%";
        return userDao.getByName(name);
    }
}
