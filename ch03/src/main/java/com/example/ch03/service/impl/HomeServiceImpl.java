package com.example.ch03.service.impl;

import com.example.ch03.dao.HomeMapper;
import com.example.ch03.domain.Home;
import com.example.ch03.service.IHomeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 类名：HomeServiceImpl
 * 描述：TODO
 * 时间：2018/2/6 18:00
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */

@Service
@Transactional
public class HomeServiceImpl implements IHomeService {
    @Autowired
    private HomeMapper homeMapper;

    @Override
    public Home findByCity(String city) {
        return homeMapper.findByCity(city);
    }
}
