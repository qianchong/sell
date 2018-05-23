package cn.com.free.ryan.shop.service;

import cn.com.free.ryan.shop.entity.ProductCategory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Package: cn.com.free.ryan.shop.service
 * Description： TODO
 * Author: qianchong
 * Date: Created in 2018/5/23 10:50
 * Company: senb
 * Copyright: Copyright (c) 2018/5/23
 * Version: 0.0.1
 * Modified By:
 */
public interface ProductCategoryService {
    ProductCategory findOne(Integer categoryId) throws Exception;

    List<ProductCategory> findAll() throws Exception;

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypes) throws Exception;

    ProductCategory save(ProductCategory productCategory) throws Exception;
}
