package com.example.ch07.enums;

import lombok.Getter;

/**
 * 类名：ProductEnum
 * 描述：TODO
 * 时间：2018/2/11 15:23
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架");
    private Integer code;
    private String msg;

    ProductStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
