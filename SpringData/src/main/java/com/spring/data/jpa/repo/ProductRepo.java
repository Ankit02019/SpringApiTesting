package com.spring.data.jpa.repo;

import org.springframework.data.repository.CrudRepository;

import com.spring.data.jpa.Entity.Product;
import java.util.List;


public interface ProductRepo extends CrudRepository<Product, Integer> {

	List<Product> findByName(String name);
	List<Product> findByPrice(double price);
	List<Product> findByNameAndPrice(String name, double price);
}
