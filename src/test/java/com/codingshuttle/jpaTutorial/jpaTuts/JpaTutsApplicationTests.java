package com.codingshuttle.jpaTutorial.jpaTuts;

import com.codingshuttle.jpaTutorial.jpaTuts.entities.ProductEntity;
import com.codingshuttle.jpaTutorial.jpaTuts.entities.productEntity;
import com.codingshuttle.jpaTutorial.jpaTuts.repositories.ProductRepository;
import com.codingshuttle.jpaTutorial.jpaTuts.repositories.productRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class JpaTutsApplicationTests {

	@Autowired
    productRepository productRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testRepository() {

		productEntity productEntity = productEntity.builder()
				.sku("nestle234")
				.title("nestle chocolate")
				.price(BigDecimal.valueOf(123.45))
				.quantity(12)
				.build();

		productEntity savedProductEntity =
				productRepository.save(productEntity);

		System.out.println(savedProductEntity);
	}
}