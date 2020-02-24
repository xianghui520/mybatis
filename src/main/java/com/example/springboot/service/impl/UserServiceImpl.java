package com.example.springboot.service.impl;

import com.example.springboot.mapper.UserMapper;
import com.example.springboot.model.User;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 通过id查询user
     *
     * @param id
     * @return
     */
    @Override
    public User findById(Integer id) {
        User user = userMapper.queryById(id);
        return user;
    }

    @Override
    public List<User> findAll() {
        List<User> userList = userMapper.queryAll();
        return userList;
    }
}
