package cn.com.free.ryan.shop.service.impl;

import cn.com.free.ryan.shop.dao.ProductCategoryDao;
import cn.com.free.ryan.shop.entity.ProductCategory;
import cn.com.free.ryan.shop.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Package: cn.com.free.ryan.shop.service.impl
 * Description： TODO
 * Author: qianchong
 * Date: Created in 2018/5/23 10:54
 * Company: senb
 * Copyright: Copyright (c) 2018/5/23
 * Version: 0.0.1
 * Modified By:
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Override
    public ProductCategory findOne(Integer categoryId) throws Exception {
        ProductCategory pc = new ProductCategory();
        pc.setCategoryId(categoryId);
        Example<ProductCategory> example = Example.of(pc);

        Optional<ProductCategory> one = productCategoryDao.findOne(example);
        return one.get();
    }

    @Override
    public List<ProductCategory> findAll() throws Exception {
        return productCategoryDao.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypes) throws Exception {
        return productCategoryDao.findByCategoryTypeIn(categoryTypes);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) throws Exception {
        return productCategoryDao.save(productCategory);
    }
}
