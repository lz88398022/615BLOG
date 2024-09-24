package com.cimc.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cimc.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    @Select("SELECT * FROM user")
    List<User> selectAllUsers();
}
