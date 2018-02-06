package com.example.ch03.service;

import com.example.ch03.domain.Home;

/**
 * 类名：HomeService
 * 描述：TODO
 * 时间：2018/2/6 17:59
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
public interface IHomeService {
    Home findByCity(String city);

}
