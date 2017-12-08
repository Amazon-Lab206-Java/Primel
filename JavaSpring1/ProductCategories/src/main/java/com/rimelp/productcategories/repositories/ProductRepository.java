package com.rimelp.productcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rimelp.productcategories.models.Product;

@Repository
public interface ProductRepository extends CrudRepository <Product, Long> {
	
	List<Product> findByNameNotIn(List<String> name);
}
