package com.liangpang.controller;


import com.liangpang.common.lang.Result;
import com.liangpang.entity.User;
import com.liangpang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 *
 * @author somnu
 * @since 2022-03-07
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/index")
    public Result index(){
        User user = userService.getById(1L);
        return Result.succ(200,"操作成功",user);
    }

}
