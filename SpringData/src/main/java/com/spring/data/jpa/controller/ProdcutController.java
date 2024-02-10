package com.spring.data.jpa.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.data.jpa.Entity.Product;
import com.spring.data.jpa.Exception.ProductNotFoundException;
import com.spring.data.jpa.repo.ProductRepo;

@RestController
@RequestMapping("/products")
public class ProdcutController {

	@Autowired
	ProductRepo productRepo;

	@GetMapping()
	public Iterable<Product> getProduct() {
		return productRepo.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Product> getSingleProduct(@PathVariable("id") int id) {


	        Optional<Product> product = productRepo.findById(id);
	        if (product.isPresent()) {
	            return ResponseEntity.ok(product.get());
	        } else {
	            throw new ProductNotFoundException("Product with ID " + id + " not found");
	        }
	}

	@PostMapping()
	public Product addProduct(@RequestBody Product product) {
		if( null == product) {
			throw new ProductNotFoundException("Product with ID not found");
		}
		else {
		return productRepo.save(product);
		}
	}

	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable("id") int id) {
		productRepo.deleteById(id);
	}

	@PutMapping()
	public Product putProduct(@RequestBody Product product) {
		return productRepo.save(product);
	}
	
}
