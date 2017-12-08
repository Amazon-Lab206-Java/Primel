package com.rimelp.productcategories.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rimelp.productcategories.models.Category;
import com.rimelp.productcategories.models.Product;
import com.rimelp.productcategories.services.CategoryService;
import com.rimelp.productcategories.services.ProductService;

@Controller
public class Products {

	private final ProductService prodService;
	private final CategoryService catService;
	
	public Products(ProductService prodService, CategoryService catService) {
		this.prodService = prodService;
		this.catService = catService;
	}
	
	@RequestMapping("/products/new")
	public String newProd(@ModelAttribute("product") Product product) {
		return "newProduct.jsp";
	}
	
	@PostMapping("/products/new")
	public String createProd(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "newProduct.jsp";
		}
		else {
			Product newProd = prodService.createProduct(product);
			String prodId = Long.toString(newProd.getId());
			return "redirect:/products/".concat(prodId);		}
	}
	
	@RequestMapping("/products/{id}")
	public String prodInfo(@ModelAttribute("newCat") Category category, @ModelAttribute("") Product product, Model model,  @PathVariable("id") Long id) {
		Product prod = prodService.getProduct(id);
		model.addAttribute("product", prod);
		model.addAttribute("categories", catService.availCats(prod));
		return "addCategory.jsp";
	}
	
	@PostMapping("/products/{id}/add")
	public String addCat(@Valid @ModelAttribute("newCat") Category category, BindingResult result, @PathVariable("id") Long prodId, @RequestParam("products") Long catId) {
		if(result.hasErrors()) {
			return "addCategory.jsp";
		}
		else {
			Category cat = catService.getCat(catId);
			Product prod = prodService.getProduct(prodId);
			String categoryId = Long.toString(catId);
			prodService.addCat(cat, prod);
			return "redirect:/categories/".concat(categoryId);
		}
			
	}
}
