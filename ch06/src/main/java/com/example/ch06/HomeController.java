package com.example.ch06;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * 类名：HomeController
 * 描述：TODO
 * 时间：2018/2/7 16:12
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model) {
        Home home = new Home();
        home.setId(1L);
        home.setCity("杭州");
        home.setProvince("浙江");
        home.setDesc("HZ·ZJ");
        List<Home> homes = new ArrayList<>();
        Home home1 = new Home();
        home1.setId(1L);
        home1.setCity("杭州1");
        home1.setProvince("浙江1");
        home1.setDesc("HZ·ZJ");
        homes.add(home1);
        Home home2 = new Home();
        home2.setId(1L);
        home2.setCity("杭州2");
        home2.setProvince("浙江2");
        home2.setDesc("HZ·ZJ");
        homes.add(home2);
        Home home3 = new Home();
        home3.setId(1L);
        home3.setCity("杭州3");
        home3.setProvince("浙江3");
        home3.setDesc("HZ·ZJ");
        homes.add(home3);
        model.addAttribute(home);
        model.addAttribute(homes);
        return "index";
    }

}
