package com.example.dao;

import com.example.entity.User;

import java.util.List;

public interface UserDao {
    public List<User> findAll();
}
