package com.rimelp.productcategories.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rimelp.productcategories.models.Category;
import com.rimelp.productcategories.models.Product;
import com.rimelp.productcategories.repositories.CategoryRepository;

@Service
public class CategoryService {

	private final CategoryRepository catRepo;
	
	public CategoryService(CategoryRepository catRepo) {
		this.catRepo = catRepo;
	}
	
	public Category createCat(Category category) {
		return catRepo.save(category);
	}
	
	public Category getCat(Long id) {
		return catRepo.findOne(id);
	}
	
	public List<Category> availCats(Product product){
		List<String> names = new ArrayList<String>();
		List<Category> currentCats = product.getCategories();
		
		if(currentCats.isEmpty()) {
			names.add("");
		}
		else {
			for(Category c : currentCats) {
				names.add(c.getName());
			}
		}
		List<Category> cats = catRepo.findByNameNotIn(names);
		return cats;
	}
	
	public void addProduct(Category category, Product product) {
		List<Product> catProds = category.getProducts();
		if(catProds.isEmpty()) {
			catProds = new ArrayList<Product>(Arrays.asList());
		}
		 catProds.add(product);
		 category.setProducts(catProds);
		 catRepo.save(category);
	}
}
