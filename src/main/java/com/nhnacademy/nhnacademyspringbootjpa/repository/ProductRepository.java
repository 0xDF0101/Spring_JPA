package com.nhnacademy.nhnacademyspringbootjpa.repository;

import com.nhnacademy.nhnacademyspringbootjpa.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Integer> {
}
