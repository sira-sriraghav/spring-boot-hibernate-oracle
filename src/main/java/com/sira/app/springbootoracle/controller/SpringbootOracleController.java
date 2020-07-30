package com.sira.app.springbootoracle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sira.app.springbootoracle.domain.ProductResponse;
import com.sira.app.springbootoracle.service.SpringbootOracleService;

@RestController
@RequestMapping("/app")
public class SpringbootOracleController {

	@Autowired
	private SpringbootOracleService springbootOracleService;

	/**
	 * This API shows SELECT operation 
	 * @return ProductResponse
	 */
	@GetMapping(path = "get/products", produces = { "application/json" })
	public ResponseEntity<ProductResponse> getProdcts() {
		return springbootOracleService.getProducts();
	}
}
