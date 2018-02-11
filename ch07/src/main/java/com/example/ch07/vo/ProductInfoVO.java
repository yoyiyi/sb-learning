package com.example.ch07.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

import lombok.Data;

/**
 * 类名：ProductInfoVo
 * 描述：TODO
 * 时间：2018/2/11 15:28
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
@Data
public class ProductInfoVO {
    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;
}
