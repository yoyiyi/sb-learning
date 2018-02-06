package com.example.ch03.dao;

import com.example.ch03.domain.Home;

import org.apache.ibatis.annotations.Param;

/**
 * 类名：HomeMapper
 * 描述：TODO
 * 时间：2018/2/6 17:56
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
public interface HomeMapper {

    /**
     * 根据城市查找家乡
     *
     * @param city
     * @return
     */
    Home findByCity(@Param("city") String city);

}
