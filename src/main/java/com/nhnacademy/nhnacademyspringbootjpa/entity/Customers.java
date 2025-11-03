package com.nhnacademy.nhnacademyspringbootjpa.entity;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "Customers")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;
    @Length(min=0, max=10)
    private String name;
    @Length(min=0, max=100)
    private String emailAddress;
    @Length(min=0, max=12)
    private String password;
}
