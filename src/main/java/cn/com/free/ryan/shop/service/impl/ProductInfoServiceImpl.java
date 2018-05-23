package cn.com.free.ryan.shop.service.impl;

import cn.com.free.ryan.shop.dao.ProductInfoDao;
import cn.com.free.ryan.shop.entity.ProductInfo;
import cn.com.free.ryan.shop.enums.ProductStatusEnum;
import cn.com.free.ryan.shop.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Package: cn.com.free.ryan.shop.service.impl
 * Description： TODO
 * Author: qianchong
 * Date: Created in 2018/5/23 11:47
 * Company: senb
 * Copyright: Copyright (c) 2018/5/23
 * Version: 0.0.1
 * Modified By:
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {
    @Autowired
    private ProductInfoDao productInfoDao;

    @Override
    public ProductInfo findOne(String productId) {
        return productInfoDao.findById(productId).get();
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoDao.findByProductStatus(ProductStatusEnum.UP.getCode());
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
