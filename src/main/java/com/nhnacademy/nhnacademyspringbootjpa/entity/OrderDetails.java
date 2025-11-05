package com.nhnacademy.nhnacademyspringbootjpa.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "OrderDetails")
@IdClass(OrderDetailsPk.class)
public class OrderDetails {

    @Id
    @ManyToOne
//    private Integer orderId;
    private Orders orders;

    @Id
    @ManyToOne
//    private Integer productId;
    private Product product;

    private Integer quantity;
    @Column(name = "UnitCost", precision = 15, scale = 0)
    private BigDecimal unitCost;
}
