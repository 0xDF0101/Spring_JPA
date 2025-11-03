package com.nhnacademy.nhnacademyspringbootjpa.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Order")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    private Integer customerId;
    private LocalDateTime orderDate;
    private LocalDateTime dateTime;
}
