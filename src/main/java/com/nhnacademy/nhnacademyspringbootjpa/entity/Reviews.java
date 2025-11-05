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
    private Product product;

//    private Integer customerId;
    @ManyToOne
    private Customer customer;

    private Integer rating;
    private Integer text;
}
