package com.example.ch07.service.impl;

import com.example.ch07.dao.ProductCategorydDao;
import com.example.ch07.domain.ProductCategory;
import com.example.ch07.service.IProductCategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 类名：ProductCategoryServiceImpl
 * 描述：TODO
 * 时间：2018/2/11 14:49
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
@Service
@Transactional
public class ProductCategoryServiceImpl implements IProductCategoryService {
    @Autowired
    private ProductCategorydDao productCategorydDao;

    @Override
    public ProductCategory findOne(Integer categoryId) {
        return productCategorydDao.findOne(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return productCategorydDao.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategorydDao.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return productCategorydDao.save(productCategory);
    }
}
