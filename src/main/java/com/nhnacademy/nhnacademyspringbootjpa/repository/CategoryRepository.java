package com.nhnacademy.nhnacademyspringbootjpa.repository;

import com.nhnacademy.nhnacademyspringbootjpa.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Categories, Integer> {
}
