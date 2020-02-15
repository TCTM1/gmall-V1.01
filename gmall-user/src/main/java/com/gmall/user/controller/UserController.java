package com.gmall.user.controller;

import com.gmall.user.pojo.UmsMember;
import com.gmall.user.pojo.User;
import com.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hello User!";
    }

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<UmsMember> getUser(){
        List<UmsMember> userMembers =  userService.getAllUser();
        return userMembers;
    }

}
