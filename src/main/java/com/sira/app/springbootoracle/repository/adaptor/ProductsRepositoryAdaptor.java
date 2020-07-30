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
import com.sira.app.springbootoracle.entity.ProductEntity;
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
		List<ProductEntity> productEntityList = null;
		try {
			CriteriaQuery<ProductEntity> criteria = getSession().getCriteriaBuilder().createQuery(ProductEntity.class);
			criteria.from(ProductEntity.class);
			productEntityList = getSession().createQuery(criteria).getResultList();
		} catch (Exception e) {
			// Exception handling
		}
		if (!CollectionUtils.isEmpty(productEntityList)) {
			productResponse.setProductList(productEntityList);
		}
		return productResponse;
	}

	@Override
	public String saveProduct(ProductEntity product) {
		int count = 0;
		String message = null;
		try {
			getSession().persist(product);
			count++;
		} catch (Exception e) {
			message = "Unable to Insert the record";
			return message;
		}
		if (count > 0)
			message = "Record Inserted Successfully";
		return message;
	}

}
