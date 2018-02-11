package com.example.ch12

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * 类名：IndexController
 * 描述：TODO
 * 时间：2018/2/10 0:53
 * @author <a href="2455676683@qq.com">zzq</a>
 */
@RestController
class IndexController {
    @GetMapping("/hello")
    fun index(): String = "Hello World"
}