package com.nhnacademy.nhnacademyspringbootjpa.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class OrderDetailsPk implements Serializable {

//    private Integer orderId;
//    private Integer productId;
    private Orders orders;
    private Product product;

    public Orders getOrders() {
        return orders;
    }

    public Product getProduct() {
        return product;
    }
}

