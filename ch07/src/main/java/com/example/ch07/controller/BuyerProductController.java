package com.example.ch07.controller;

import com.example.ch07.domain.ProductCategory;
import com.example.ch07.domain.ProductInfo;
import com.example.ch07.service.IProductCategoryService;
import com.example.ch07.service.IProductInfoService;
import com.example.ch07.utils.ResultVOUtil;
import com.example.ch07.vo.ProductInfoVO;
import com.example.ch07.vo.ProductVO;
import com.example.ch07.vo.ResultVO;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 类名：BuyerProductController
 * 描述：TODO
 * 时间：2018/2/11 15:34
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {
    @Autowired
    private IProductInfoService productInfoService;
    @Autowired
    private IProductCategoryService productCategoryService;

    @GetMapping("/list")
    public ResultVO list() {
        //查询所有上架商品
        List<ProductInfo> productInfoList = productInfoService.findUpAll();
        //查询类目
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(e -> e.getCategoryType())
                .collect(Collectors.toList());
        List<ProductCategory> productCategoryList = productCategoryService.findByCategoryTypeIn(categoryTypeList);
        //数据拼接
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory : productCategoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryType(productCategory.getCategoryType());
            productVO.setCategoryName(productCategory.getCategoryName());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }
        return ResultVOUtil.success(productVOList);

    }


}
