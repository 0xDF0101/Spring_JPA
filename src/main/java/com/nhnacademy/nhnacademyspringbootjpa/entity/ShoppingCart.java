package com.nhnacademy.nhnacademyspringbootjpa.entity;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;

@Entity
@Table(name = "ShoppingCart")
public class ShoppingCart {
    @Id
    @GeneratedValue
    private Integer recordId;
    @Length(min=1, max=150)
    private String cardId;
    private Integer quantity;

//    private Integer productId;
    @ManyToOne
    private Product product;


    @Column(name = "DateCreateed", updatable = false)
    private LocalDateTime dateCreated;
}
