package com.project1.day4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project1.day4.model.Product;

public interface ProductRepo extends JpaRepository<Product,Integer>{
}
