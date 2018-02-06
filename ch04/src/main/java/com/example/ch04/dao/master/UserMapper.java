package com.example.ch04.dao.master;

import com.example.ch04.domain.User;

import org.apache.ibatis.annotations.Param;

/**
 * 类名：UserMapper
 * 描述：TODO
 * 时间：2018/2/6 19:06
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
public interface UserMapper {

    User findByName(@Param("name") String name);
}
