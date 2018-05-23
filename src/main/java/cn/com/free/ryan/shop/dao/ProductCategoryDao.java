package cn.com.free.ryan.shop.dao;

import cn.com.free.ryan.shop.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Package: cn.com.free.ryan.shop.dao
 * Description： TODO
 * @author: qianchong
 * Date: Created in 2018/5/23 9:59
 * Company: senb
 * Copyright: Copyright (c) 2018/5/23
 * Version: 0.0.1
 * Modified By:
 */
public interface ProductCategoryDao extends JpaRepository<ProductCategory, Integer> {
    /**
     * 查询指定类型的产品
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
