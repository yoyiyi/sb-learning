package com.example.ch07.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import lombok.Data;

/**
 * 类名：ProductVO
 * 描述：TODO
 * 时间：2018/2/11 15:29
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
@Data
public class ProductVO {
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
