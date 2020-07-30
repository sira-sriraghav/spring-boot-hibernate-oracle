package com.sira.app.springbootoracle.domain;

import java.util.List;

import com.sira.app.springbootoracle.entity.Products;

public class ProductResponse {

	private List<Products> productList;

	public List<Products> getProductList() {
		return productList;
	}

	public void setProductList(List<Products> productList) {
		this.productList = productList;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}
