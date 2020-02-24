package com.example.springboot.controller;

import com.example.springboot.mapper.UserMapper;
import com.example.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController
{

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/")
    public @ResponseBody String home()
    {
        return "hello world";

    }

    @RequestMapping("/query")
    public @ResponseBody List<User> queryById()
    {
        List<User> userList = new ArrayList<>();
        userList = userMapper.queryAll();
        return userList;
    }





}
