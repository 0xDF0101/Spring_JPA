package com.nhnacademy.nhnacademyspringbootjpa.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

//    private Integer customerId;
    @ManyToOne
    private Customer customer;

    private LocalDateTime orderDate;
    private LocalDateTime dateTime;
}
