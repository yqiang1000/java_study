package com.yq.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Address {

    private Integer id;   //id
    private String contact; //联系人姓名
    private String addressDesc; //'收货地址明细'
    private String postCode; //'邮编'
    private String tel; //'联系人电话'
    private Integer createdBy; //创建者
    private Date creationDate; //创建时间
    private Integer modifyBy; //更新者
    private Date modifyDate;//更新时间
    private String userId;//用户ID

}
