package com.sira.app.springbootoracle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sira.app.springbootoracle.domain.ProductResponse;
import com.sira.app.springbootoracle.repository.ProductsRepository;

@Service
public class SpringbootOracleService {

	@Autowired
	private ProductsRepository productsRepository;

	public ResponseEntity<ProductResponse> getProducts() {
		return new ResponseEntity<>(productsRepository.getProducts(), HttpStatus.OK);
	}
}
