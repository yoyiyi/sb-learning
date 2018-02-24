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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

/**
 * 类名：BuyerProductController
 * 描述：TODO
 * 时间：2018/2/11 15:34
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
@RestController
@RequestMapping("/buyer/product")
@Slf4j
@Api(tags = "买家接口")
public class BuyerProductController {
    @Autowired
    private IProductInfoService productInfoService;
    @Autowired
    private IProductCategoryService productCategoryService;

    @ApiOperation(value = "获取所有商品")
    @GetMapping("/list")
    public ResultVO list() {
        //查询所有上架商品
        log.info("查询所有商家商品");
        List<ProductInfo> productInfoList = productInfoService.findUpAll();
        //查询类目
        log.info("查询类目");
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(ProductInfo::getCategoryType)
                .collect(Collectors.toList());
        List<ProductCategory> productCategoryList = productCategoryService.findByCategoryTypeIn(categoryTypeList);
        log.info("数据拼接");
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
