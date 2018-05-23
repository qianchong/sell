package cn.com.free.ryan.shop.service.impl;

import cn.com.free.ryan.shop.entity.ProductCategory;
import cn.com.free.ryan.shop.service.ProductCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Package: cn.com.free.ryan.shop.service.impl
 * Description： TODO
 * Author: qianchong
 * Date: Created in 2018/5/23 11:04
 * Company: senb
 * Copyright: Copyright (c) 2018/5/23
 * Version: 0.0.1
 * Modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryServiceImplTests {

    @Autowired
    private ProductCategoryService productCategoryService;

    @Test
    @Transactional
    public void save() throws Exception {
        productCategoryService.save(new ProductCategory("service", 2));
    }

    @Test
    public void findOne() throws Exception {
        productCategoryService.findOne(9);
    }

    @Test
    public void findAll() throws Exception {
        List<ProductCategory> all = productCategoryService.findAll();
        System.out.println(all.size());
    }


    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<Integer> categoryTypeIds = Arrays.asList(2, 3, 4);
        List<ProductCategory> all = productCategoryService.findByCategoryTypeIn(categoryTypeIds);
        System.out.println(all.size());
    }
}