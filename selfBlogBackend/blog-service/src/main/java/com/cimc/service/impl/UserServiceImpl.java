package com.cimc.service.impl;

import com.cimc.dao.mapper.UserMapper;
import com.cimc.entity.User;
import com.cimc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public Integer add(User user) {
        return 0;
    }

    @Override
    public List<User> select() {
        return userMapper.selectAllUsers();
    }
}
