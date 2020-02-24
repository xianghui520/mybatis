package com.example.springboot.service;

import com.example.springboot.model.User;

import java.util.List;


public interface UserService

{
    /**
     * 通过id查询user
     * @param id
     * @return
     */
    User findById(Integer id);


    List<User> findAll();









}
