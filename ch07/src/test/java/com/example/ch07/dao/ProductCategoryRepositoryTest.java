package com.example.ch07.dao;

import com.example.ch07.domain.ProductCategory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 类名：ProductCategoryRepositoryTest
 * 描述：TODO
 * 时间：2018/2/11 14:24
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategorydDao productCategoryRepository;

    @Test
    public void testFindOne() {
        ProductCategory one = productCategoryRepository.findOne(1);
        System.out.println(one);

    }
}