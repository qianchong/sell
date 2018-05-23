package cn.com.free.ryan.shop.dao;

import cn.com.free.ryan.shop.entity.ProductCategory;
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
 * Package: cn.com.free.ryan.shop.dao
 * Description： TODO
 * Author: qianchong
 * Date: Created in 2018/5/23 10:10
 * Company: senb
 * Copyright: Copyright (c) 2018/5/23
 * Version: 0.0.1
 * Modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryDaoTests {
    @Autowired
    private ProductCategoryDao productCategoryDao;

//    @Test
//    public void contextLoads() {
//
//    }

    @Test
    @Transactional
    public void initDatas() {
        ProductCategory pc = new ProductCategory("热恋", 1);
        productCategoryDao.save(pc);
        pc = new ProductCategory("热恋2", 2);
        productCategoryDao.save(pc);
    }

    @Test
    public void findByCategoryTypeInTest() {
        List<Integer> list = Arrays.asList(2, 3, 4);
        List<ProductCategory> pcList = productCategoryDao.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, pcList.size());
    }

    @Test
    public void findAllTest() {
        List<ProductCategory> pcList = productCategoryDao.findAll();
        System.out.println(pcList.size());
    }


}