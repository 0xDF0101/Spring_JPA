package com.nhnacademy.nhnacademyspringbootjpa.entity;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "Categories")
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CategoryID")
    private Integer CategoryId;
    @Length(min=0, max=50)
    @Column(name = "CategoryName")
    private String CategoryName;
}
