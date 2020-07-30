package com.sira.app.springbootoracle.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTS", schema = "SIRA")
public class Products {

	@Id
	@Column(name = "ID")
	private String productId;
	
	@Column(name = "DESCRIPTION")
	private String description;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}
