package com.nhnacademy.nhnacademyspringbootjpa.entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class OrderDetailsPk implements Serializable {

    private Integer orderId;
    private Integer productId;

    public long getOrderId() {
        return orderId;
    }

    public int getProductId() {
        return productId;
    }
}
