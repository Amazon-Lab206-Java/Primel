package com.rimelp.productcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rimelp.productcategories.models.Category;

@Repository
public interface CategoryRepository extends CrudRepository <Category, Long>{

	List<Category> findByNameNotIn(List<String> name);
}
