package com.example.ch02;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 类名：HomePeoperties
 * 描述：TODO
 * 时间：2018/2/6 17:12
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
@Component
@ConfigurationProperties(prefix = "home")
public class HomeProperties {
    private String province;
    private String city;
    private String desc;
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "HomeProperties{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", desc='" + desc + '\'' +
                ", id=" + id +
                '}';
}
}
