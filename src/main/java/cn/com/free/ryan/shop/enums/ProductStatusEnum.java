package cn.com.free.ryan.shop.enums;

import lombok.Getter;
import lombok.Getter;

/**
 * Package: cn.com.free.ryan.shop.enums
 * Description： TODO
 * Author: qianchong
 * Date: Created in 2018/5/23 11:50
 * Company: senb
 * Copyright: Copyright (c) 2018/5/23
 * Version: 0.0.1
 * Modified By:
 */
@Getter
public enum ProductStatusEnum {
    DOWN(0, "下架"), UP(1, "在架");

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String messages) {
        this.code = code;
        this.message = messages;
    }
}
