package com.nhnacademy.nhnacademyspringbootjpa.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "OrderDetails")
@IdClass(OrderDetailsPk.class)
public class OrderDetails {

    @Id
    private Integer orderId;
    @Id
    private Integer productId;
    private Integer quantity;
    @Column(name = "UnitCost", precision = 15, scale = 0)
    private BigDecimal unitCost;
}
