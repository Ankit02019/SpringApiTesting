//package com.spring.data.jpa;
//
////import static org.junit.Assert.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.web.client.RestClientException;
//import org.springframework.web.client.RestTemplate;
//
//import com.spring.data.jpa.Entity.Product;
//
////@RunWith(SpringRunner.class)
//@SpringBootTest
//public class SpringDataApplicationTests {
////@Autowired
////ApplicationContext applicationContext;
//	@Value("${SpringData.services.url}")
//	@Autowired
//	private String baseUrl;
//	
//	@Test
//	public void saveProduct() {
//		RestTemplate restTemplate = new RestTemplate();
//
//		try {
//			ResponseEntity<Product> responseEntity = restTemplate.getForEntity(baseUrl, Product.class);
//			Product product = responseEntity.getBody();
//			// Do something with the product
//			assertNotNull(product);
//			assertEquals("maa", product.getName());
//		} catch (RestClientException e) {
//			// Handle the RestClientException
//
//			e.printStackTrace();
//		}
//
////		Product forObject = restTemplate.getForObject("http://localhost:8080/products", Product.class);
//
////		ProductRepo repo = applicationContext.getBean(ProductRepo.class);
////		Product product2 = new Product();
////		
////		product2.setId(45);
////		product2.setName("ankit");
////		product2.setDiscription("eng");
////		product2.setPrice(45600);
////		product2.setId(23);
////		product2.setName("ankit");
////		product2.setDiscription("Macanicl");
////		product2.setPrice(1200);
////		repo.save(product2);
//////		Optional<Product> result = repo.findById(45);
//////		System.out.println(result);
//////		result.setPrice(6);
//////		repo.findAll().forEach(p->System.out.println(p.getPrice()));
////		System.out.println("findbyname:"+repo.findByName("ankit"));
////
////		System.out.println("alone:"+repo.findByNameAndPrice("ankit",45600));
//
//	}
//
//	@Test
//	public void postRest() {
//		RestTemplate restTemplate = new RestTemplate();
//		Product product = new Product();
//		product.setId(290);
//		product.setName("papa");
//		product.setPrice(678975);
//		product.setDiscription("papa");
//		String responseEntity = restTemplate.postForObject(baseUrl, product, String.class);
//		byte[] responseBody = responseEntity.getBytes();
//		assertNotNull(responseBody);
//	}
//}
