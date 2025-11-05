package com.nhnacademy.nhnacademyspringbootjpa.repository;

import com.nhnacademy.nhnacademyspringbootjpa.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customers, Integer> {
}
