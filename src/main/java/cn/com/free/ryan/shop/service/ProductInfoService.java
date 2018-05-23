package cn.com.free.ryan.shop.service;

import cn.com.free.ryan.shop.entity.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Package: cn.com.free.ryan.shop.service
 * Description： TODO
 * Author: qianchong
 * Date: Created in 2018/5/23 11:45
 * Company: senb
 * Copyright: Copyright (c) 2018/5/23
 * Version: 0.0.1
 * Modified By:
 */
public interface ProductInfoService {
    ProductInfo findOne(String productId);

    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);


}
