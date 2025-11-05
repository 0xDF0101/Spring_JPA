package com.nhnacademy.nhnacademyspringbootjpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;
    @Length(min=0, max=10)
    private String name;
    @Length(min=0, max=100)
    private String emailAddress;
    @Length(min=0, max=12)
    private String password;

    public Customer(String name, String emailAddress, String password) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.password = password;
    }
}
