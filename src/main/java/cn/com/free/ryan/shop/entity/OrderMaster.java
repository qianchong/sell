package cn.com.free.ryan.shop.entity;

import cn.com.free.ryan.shop.enums.OrderStatusEnum;
import cn.com.free.ryan.shop.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
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
 * @create: Created in 2018/5/25 8:30
 * Company: senb
 * Copyright: Copyright (c) 2018/5/25
 * Version: 0.0.1
 * Modified By:
 */
@Entity
@Data
@DynamicUpdate
public class OrderMaster {
    @Id
    @GenericGenerator(name = "order-uuid", strategy = "uuid")
    @GeneratedValue(generator = "order-uuid")
    @Column(name = "order_id", nullable = false, length = 64)
    private String orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    private String buyerOpenid;
    private BigDecimal orderAmount;
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();
    private Integer payStatus = PayStatusEnum.WAIT.getCode();
    private Date createTime;
    private Date updateTime;

}
