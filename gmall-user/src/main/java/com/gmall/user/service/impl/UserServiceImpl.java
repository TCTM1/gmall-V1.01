package com.gmall.user.service.impl;

import com.gmall.user.mapper.UserMapper;
import com.gmall.user.pojo.UmsMember;
import com.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> members = userMapper.selectAll();
        return members;
    }
}
