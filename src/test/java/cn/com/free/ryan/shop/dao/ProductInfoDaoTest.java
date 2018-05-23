package cn.com.free.ryan.shop.dao;

import cn.com.free.ryan.shop.entity.ProductInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Package: cn.com.free.ryan.shop.dao
 * Description： TODO
 * Author: qianchong
 * Date: Created in 2018/5/23 11:28
 * Company: senb
 * Copyright: Copyright (c) 2018/5/23
 * Version: 0.0.1
 * Modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductInfoDaoTest {

    @Autowired
    private ProductInfoDao productInfoDao;

    @Test
    @Transactional
    public void saveTest() {
        ProductInfo p = new ProductInfo();
        p.setProductName("挂面");
        p.setProductPrice(new BigDecimal(3.2));
        p.setProductStock(100);
        p.setProductDescription("");
        p.setProductIcon("http://xx.jpg");
        p.setProductStatus(0);
        p.setCategoryType(2);
        productInfoDao.save(p);
    }

    @Test
    public void findByProductStatus() {
        List<ProductInfo> productInfoList = productInfoDao.findByProductStatus(0);
    }
}