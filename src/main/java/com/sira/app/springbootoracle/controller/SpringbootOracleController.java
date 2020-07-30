package com.sira.app.springbootoracle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sira.app.springbootoracle.domain.Product;
import com.sira.app.springbootoracle.domain.ProductResponse;
import com.sira.app.springbootoracle.service.SpringbootOracleService;

@RestController
@RequestMapping("/api")
public class SpringbootOracleController {

	@Autowired
	private SpringbootOracleService springbootOracleService;

	/**
	 * This API shows SELECT operation
	 * 
	 * @return ProductResponse
	 */
	@GetMapping(path = "get/products", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ProductResponse> getProdcts() {
		return springbootOracleService.getProducts();
	}

	/**
	 * This API shows INSERT operation
	 * 
	 * @return ProductResponse
	 */
	@PostMapping(path = "product/save", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> saveProdct(@RequestBody Product product) {
		return springbootOracleService.saveProduct(product);
	}
}
