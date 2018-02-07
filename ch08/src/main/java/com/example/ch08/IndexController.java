package com.example.ch08;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 类名：IndexController
 * 描述：TODO
 * 时间：2018/2/7 18:00
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
//@Controller
public class IndexController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

}
