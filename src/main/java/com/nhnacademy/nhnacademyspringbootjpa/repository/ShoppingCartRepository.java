package com.nhnacademy.nhnacademyspringbootjpa.repository;

import com.nhnacademy.nhnacademyspringbootjpa.entity.Customer;
import com.nhnacademy.nhnacademyspringbootjpa.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Integer> {


}
