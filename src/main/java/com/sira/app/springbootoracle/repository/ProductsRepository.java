package com.sira.app.springbootoracle.repository;

import com.sira.app.springbootoracle.domain.ProductResponse; 

public interface ProductsRepository {

	public abstract ProductResponse getProducts();
}
