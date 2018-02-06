package com.example.ch03.domain;

/**
 * 类名：Home
 * 描述：TODO
 * 时间：2018/2/6 17:54
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
public class Home {
    private String province;
    private String city;
    private String desc;
    private Long id;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
