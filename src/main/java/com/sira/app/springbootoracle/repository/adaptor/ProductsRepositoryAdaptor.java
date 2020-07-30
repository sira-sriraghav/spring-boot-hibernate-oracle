package com.sira.app.springbootoracle.repository.adaptor;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;
import javax.persistence.criteria.CriteriaQuery; 

import com.sira.app.springbootoracle.domain.ProductResponse;
import com.sira.app.springbootoracle.entity.Products;
import com.sira.app.springbootoracle.repository.ProductsRepository;

@Repository
@Transactional
public class ProductsRepositoryAdaptor implements ProductsRepository {

	@Autowired
	private EntityManager entityManager;

	public Session getSession() {
		return entityManager.unwrap(Session.class);
	}

	@Override
	public ProductResponse getProducts() {
		ProductResponse productResponse = new ProductResponse();
		CriteriaQuery<Products> criteria = getSession().getCriteriaBuilder().createQuery(Products.class);
		criteria.from(Products.class);
		List<Products> productList = getSession().createQuery(criteria).getResultList();
		if (!CollectionUtils.isEmpty(productList)) {
			productResponse.setProductList(productList);
		}
		return productResponse;
	}

}
