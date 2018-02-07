package com.example.ch04.controller;

import com.example.ch04.domain.User;
import com.example.ch04.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类名：UserController
 * 描述：TODO
 * 时间：2018/2/7 10:38
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/{name}")
    public User findByName(@PathVariable(name = "name", required = false) String name) {
        return userService.findByName(name);
    }

}
