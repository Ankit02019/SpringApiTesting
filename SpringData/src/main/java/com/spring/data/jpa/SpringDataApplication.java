package com.spring.data.jpa;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.data.jpa.Entity.Product;

@SpringBootApplication
public class SpringDataApplication {
	public static List<Product> listOfProduct() {
		List<Product> product = new  ArrayList<>();		
		return product;
		
	}

	public static void main(String[] args) {
		List<Product> productList = listOfProduct();
		OptionalDouble resutt = productList.stream().mapToDouble(Product::getPrice).distinct().findFirst();
		System.out.println("result: "+resutt);
		SpringApplication.run(SpringDataApplication.class, args);
	}

}
