package com.example.ch04.service.impl;

import com.example.ch04.dao.cluster.HomeMapper;
import com.example.ch04.dao.master.UserMapper;
import com.example.ch04.domain.Home;
import com.example.ch04.domain.User;
import com.example.ch04.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 类名：UserServiceImpl
 * 描述：TODO
 * 时间：2018/2/7 10:29
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private HomeMapper homeMapper;

    @Override
    public User findByName(String name) {
        User user = userMapper.findByName(name);
        Home home = homeMapper.findByCity("杭州");
        user.setHome(home);
        return user;
    }
}
