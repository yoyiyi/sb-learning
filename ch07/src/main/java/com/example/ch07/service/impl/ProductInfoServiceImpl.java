package com.example.ch07.service.impl;

import com.example.ch07.dao.ProductInfoDao;
import com.example.ch07.domain.ProductInfo;
import com.example.ch07.service.IProductInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 类名：ProductService
 * 描述：TODO
 * 时间：2018/2/11 15:20
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
@Service
@Transactional
public class ProductInfoServiceImpl implements IProductInfoService {
    @Autowired
    private ProductInfoDao productInfoDao;

    @Override
    public ProductInfo findOne(String productId) {
        return productInfoDao.findOne(productId);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoDao.findByProductStatus(0);
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return productInfoDao.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return productInfoDao.save(productInfo);
    }
}
