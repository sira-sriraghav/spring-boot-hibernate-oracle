package com.sira.app.springbootoracle.domain;

import java.util.List;

import com.sira.app.springbootoracle.entity.ProductEntity;

public class ProductResponse {

	private List<ProductEntity> productList;

	public List<ProductEntity> getProductList() {
		return productList;
	}

	public void setProductList(List<ProductEntity> productList) {
		this.productList = productList;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}
