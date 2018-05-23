package cn.com.free.ryan.shop.dao;

import cn.com.free.ryan.shop.entity.ProductCategory;
import cn.com.free.ryan.shop.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Package: cn.com.free.ryan.shop.dao
 * Description： TODO
 * Author: qianchong
 * Date: Created in 2018/5/23 11:25
 * Company: senb
 * Copyright: Copyright (c) 2018/5/23
 * Version: 0.0.1
 * Modified By:
 */
public interface ProductInfoDao extends JpaRepository<ProductInfo, String> {
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
