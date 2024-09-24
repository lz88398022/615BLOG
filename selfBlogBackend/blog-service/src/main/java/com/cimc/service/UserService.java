package com.cimc.service;

import com.cimc.entity.User;

import java.util.List;

public interface UserService {


     Integer add(User user);

     List<User> select();

}
