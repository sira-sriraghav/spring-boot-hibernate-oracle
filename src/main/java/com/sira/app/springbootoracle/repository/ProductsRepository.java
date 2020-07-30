package com.sira.app.springbootoracle.repository;

import com.sira.app.springbootoracle.domain.ProductResponse;
import com.sira.app.springbootoracle.entity.ProductEntity; 

public interface ProductsRepository {

	public abstract ProductResponse getProducts();
	
	public abstract String saveProduct(ProductEntity productEntity);
}
