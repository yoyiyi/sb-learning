package com.example.ch07.dao;


import com.example.ch07.domain.ProductCategory;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by zzq
 * 2017-05-07 14:35
 */
public interface ProductCategorydDao extends JpaRepository<ProductCategory, Integer> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
