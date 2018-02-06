package com.example.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类名：HelloWorldController
 * 描述：TODO
 * 时间：2018/2/6 15:51
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/")
    public String sayHello() {
        return "sss";
    }
}
