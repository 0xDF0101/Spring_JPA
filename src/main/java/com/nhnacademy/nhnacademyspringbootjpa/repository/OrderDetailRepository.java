package com.nhnacademy.nhnacademyspringbootjpa.repository;

import com.nhnacademy.nhnacademyspringbootjpa.entity.OrderDetails;
import com.nhnacademy.nhnacademyspringbootjpa.entity.OrderDetailsPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetails, OrderDetailsPk> {
}
