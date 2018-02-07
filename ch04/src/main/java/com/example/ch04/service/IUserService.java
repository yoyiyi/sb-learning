package com.example.ch04.service;

import com.example.ch04.domain.User;

/**
 * 类名：IUserService
 * 描述：TODO
 * 时间：2018/2/7 10:28
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
public interface IUserService {
    User findByName(String name);
}
