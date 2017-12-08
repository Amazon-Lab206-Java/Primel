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
public class Categories {

	private final CategoryService catService;
	private final ProductService prodService;
	
	public Categories(CategoryService catService, ProductService prodService) {
		this.catService = catService;
		this.prodService = prodService;
	}
	
	@RequestMapping("/categories/new")
	public String newCat(@ModelAttribute("category") Category category) {
		return "newCategory.jsp";
	}
	
	@PostMapping("/categories/new")
	public String createCat(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "newCategory.jsp";
		}
		else {
			Category newCat = catService.createCat(category);
			String catId = Long.toString(newCat.getId());
			return "redirect:/categories/".concat(catId);
		}
	}
	
	@RequestMapping("/categories/{id}")
	public String catInfo(@ModelAttribute("newProd") Product product, Model model, @PathVariable("id") Long id) {
		Category cat = catService.getCat(id);
		model.addAttribute("category", cat);
		model.addAttribute("products", prodService.availProducts(cat));
		return "addProduct.jsp";
	}
	
	@PostMapping("/categories/{id}/add")
	public String addProd(@Valid @ModelAttribute("newProd") Product product, BindingResult result, @PathVariable("id") Long catId, @RequestParam("categories") Long prodId) {
		if(result.hasErrors()) {
			return "addProduct.jsp";
		}
		else {
			Category cat = catService.getCat(catId);
			Product prod = prodService.getProduct(prodId);
			String productId = Long.toString(prodId);
			catService.addProduct(cat, prod);
			return "redirect:/products/".concat(productId);
		}
	}
}
