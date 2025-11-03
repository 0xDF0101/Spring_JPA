package com.nhnacademy.nhnacademyspringbootjpa.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Reviews")
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reviewId;
    private Integer productId;
    private Integer customerId;
    private Integer rating;
    private Integer text;
}
