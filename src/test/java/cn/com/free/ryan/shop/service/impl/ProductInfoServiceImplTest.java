package cn.com.free.ryan.shop.service.impl;

import cn.com.free.ryan.shop.entity.ProductInfo;
import cn.com.free.ryan.shop.service.ProductCategoryService;
import cn.com.free.ryan.shop.service.ProductInfoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Package: cn.com.free.ryan.shop.service.impl
 * Description： TODO
 * Author: qianchong
 * Date: Created in 2018/5/23 11:55
 * Company: senb
 * Copyright: Copyright (c) 2018/5/23
 * Version: 0.0.1
 * Modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductInfoServiceImplTest {
    @Autowired
    private ProductInfoService productInfoService;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findOne() {
        productInfoService.findOne("1");
    }

    @Test
    public void findUpAll() {
        productInfoService.findUpAll();
    }

    @Test
    public void findAll() {
//        PageRequest request = new PageRequest(0, 2);
        Page<ProductInfo> productPage = productInfoService.findAll(PageRequest.of(0, 2));
    }

    @Test
    public void save() {
        ProductInfo p = new ProductInfo();
        p.setProductName("挂面2");
        p.setProductPrice(new BigDecimal(3.2));
        p.setProductStock(100);
        p.setProductDescription("");
        p.setProductIcon("http://xx.jpg");
        p.setProductStatus(0);
        p.setCategoryType(2);
        productInfoService.save(p);
    }
}