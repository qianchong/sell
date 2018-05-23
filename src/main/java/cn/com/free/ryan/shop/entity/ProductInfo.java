package cn.com.free.ryan.shop.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Package: cn.com.free.ryan.shop.entity
 * Description： TODO
 * Author: qianchong
 * Date: Created in 2018/5/23 11:22
 * Company: senb
 * Copyright: Copyright (c) 2018/5/23
 * Version: 0.0.1
 * Modified By:
 */
@Entity
@Table(name = "product_info")
@Data
public class ProductInfo {
    @Id
    @GenericGenerator(name = "product-uuid", strategy = "uuid")
    @GeneratedValue(generator = "product-uuid")
    @Column(name = "product_id", nullable = false, length = 64)
    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productStock;

    private String productDescription;

    private String productIcon;

    private Integer productStatus;

    private Integer categoryType;
}
