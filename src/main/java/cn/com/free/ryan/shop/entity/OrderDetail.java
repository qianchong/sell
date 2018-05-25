package cn.com.free.ryan.shop.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * project: sell
 * Description： TODO
 *
 * @author: Administrator
 * @create: Created in 2018/5/25 8:43
 * Company: senb
 * Copyright: Copyright (c) 2018/5/25
 * Version: 0.0.1
 * Modified By:
 */
@Entity
@Data
public class OrderDetail {
    @Id
    @GenericGenerator(name = "orderDetail-uuid", strategy = "uuid")
    @GeneratedValue(generator = "orderDetail-uuid")
    @Column(name = "orderDetail_id", nullable = false, length = 64)
    private String detailId;

    private String orderId;

    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productQuantity;

    private String productIcon;
}
