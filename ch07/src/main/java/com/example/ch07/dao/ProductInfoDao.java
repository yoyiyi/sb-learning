package com.example.ch07.dao;


import com.example.ch07.domain.ProductInfo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 商品
 */
public interface ProductInfoDao extends JpaRepository<ProductInfo, String > {

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
