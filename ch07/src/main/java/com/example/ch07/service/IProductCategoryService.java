package com.example.ch07.service;

import com.example.ch07.domain.ProductCategory;

import java.util.List;

/**
 * 类名：IProductCategoryService
 * 描述：TODO
 * 时间：2018/2/11 14:48
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
public interface IProductCategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}
