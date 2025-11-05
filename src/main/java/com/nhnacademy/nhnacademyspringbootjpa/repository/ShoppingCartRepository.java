package com.nhnacademy.nhnacademyspringbootjpa.repository;

import com.nhnacademy.nhnacademyspringbootjpa.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Integer> {
}
