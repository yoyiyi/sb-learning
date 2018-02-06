package com.example.ch03.controller;

import com.example.ch03.domain.Home;
import com.example.ch03.service.IHomeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类名：HomeController
 * 描述：TODO
 * 时间：2018/2/6 18:03
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
@RestController
public class HomeController {
   @Autowired
   private IHomeService homeService;


    @GetMapping("/{city}")
    public Home findByCity(@PathVariable(name = "city", value = "") String city) {
        return homeService.findByCity(city);
    }
}
