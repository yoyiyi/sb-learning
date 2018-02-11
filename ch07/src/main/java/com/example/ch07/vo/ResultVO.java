package com.example.ch07.vo;

import lombok.Data;

/**
 * 类名：ResultVo
 * 描述：TODO
 * 时间：2018/2/11 15:28
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
@Data
public class ResultVO<T> {
    /**
     * 错误码.
     */
    private Integer code;

    /**
     * 提示信息.
     */
    private String msg;

    /**
     * 具体内容.
     */
    private T data;
}
