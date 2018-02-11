package com.example.ch07.service;

import com.example.ch07.domain.ProductInfo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 类名：IProductInfoService
 * 描述：TODO
 * 时间：2018/2/11 14:48
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
public interface IProductInfoService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品列表
     *
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 分页
     *
     * @param pageable
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

    /**
     * 保存
     *
     * @param productInfo
     * @return
     */
    ProductInfo save(ProductInfo productInfo);

    //加库存
    //void increaseStock(List<CartDTO> cartDTOList);

    //减库存
    // void decreaseStock(List<CartDTO> cartDTOList);

    //上架
    //ProductInfo onSale(String productId);

    //下架
    // ProductInfo offSale(String productId);

}
