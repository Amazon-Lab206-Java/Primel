package com.rimelp.productcategories.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rimelp.productcategories.models.Category;
import com.rimelp.productcategories.models.Product;
import com.rimelp.productcategories.repositories.CategoryRepository;
import com.rimelp.productcategories.repositories.ProductRepository;

@Service
public class ProductService {

	private final ProductRepository prodRepo;
	private final CategoryRepository catRepo;
	
	public ProductService(ProductRepository prodRepo, CategoryRepository catRepo) {
		this.prodRepo = prodRepo;
		this.catRepo = catRepo;
	}
	
	public Product createProduct(Product product) {
		return prodRepo.save(product);
	}
	
	public Product getProduct(Long id) {
		return prodRepo.findOne(id);
	}
	
	public List<Product> availProducts(Category category){
		List<String> names = new ArrayList<String>();
		List<Product> currentProds = category.getProducts();
		
		if(currentProds.isEmpty()) {
			names.add("");
		}
		else {
			for(Product p : currentProds) {
				names.add(p.getName());
			}
		}
		List<Product> prods = prodRepo.findByNameNotIn(names);
		return prods;
	}
	
	public void addCat(Category category, Product product) {
		List<Category> prodCats = product.getCategories();
		if(prodCats.isEmpty()) {
			prodCats = new ArrayList<Category>(Arrays.asList());
		}
		prodCats.add(category);
		product.setCategories(prodCats);
		prodRepo.save(product);
	}
}
