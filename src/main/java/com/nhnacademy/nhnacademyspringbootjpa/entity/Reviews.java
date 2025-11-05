package com.nhnacademy.nhnacademyspringbootjpa.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Reviews")
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reviewId;

//    private Integer productId;
    @ManyToOne
    private Products products;

//    private Integer customerId;
    @ManyToOne
    private Customers customers;

    private Integer rating;
    private Integer text;
}
