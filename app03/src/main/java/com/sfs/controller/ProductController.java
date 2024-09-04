package com.sfs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sfs.beans.Product;
import com.sfs.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/")
	public String showWelcomePage() {
		return "welcome";
	}
	
	/*======================= GET Request =========================*/
	
	@GetMapping("/addpage")
	public String showAddForm(ModelMap model) {
		model.addAttribute("product", new Product());
		return "addform";
	}
	
	@GetMapping("/searchpage")
	public String showSearchForm(ModelMap model) {
		model.addAttribute("product", new Product());		
		return "searchform";
	}
	
	@GetMapping("/updatepage")
	public String showUpdateForm(ModelMap model) {		
		model.addAttribute("product", new Product());		
		return "updateform";
	}
	
	@PostMapping("/editpage")
	public String showEditForm(@RequestParam("pid") String pid, ModelMap model) {
		Product prd = productService.searchProduct(pid);
		
		if(prd != null) {
			model.addAttribute("product", prd);
			return "producteditform";
		}else {
			model.addAttribute("status", "Product Not Found...");
			return "status";
		}				
	}
	
	@GetMapping("deletepage")
	public String showDeleteForm(ModelMap model) {
		model.addAttribute("product", new Product());
		return "deleteform";
	}
	
	/*======================= POST Request =========================*/
	
	
	
	@PostMapping("/add")
	public String addProduct(Product product, ModelMap model) {		
		Product product1 = productService.saveProduct(product);		
		if(product1 != null) {
			model.addAttribute("status", "Product Added Successfully...");
		}else {
			model.addAttribute("status", "Product Not Added...");
		}
		
		return "status";
	}
	
	@PostMapping("/search")
	public String searchProduct(Product product, ModelMap model) {		
		Product prd = productService.searchProduct(product.getPid());
		if(prd != null) {
			model.addAttribute("product", prd);
			return "productdetail";
		}else {
			model.addAttribute("status", "Product Not Found");
			return "status";
		}	
	}
	
	@PostMapping("/update")
	public String updateProduct(Product product, ModelMap model) {		
			int rowCount = productService.updateProduct(product);
			if(rowCount != 0) {
				model.addAttribute("status", "Product Update Successfully...");
			}else {
				model.addAttribute("status", "Product Not Updated...");
			}				
		return "status";		
	}	
	
	@PostMapping("/delete")
	public String deleteProduct(@RequestParam("pid") String pid, ModelMap model) {
		Product prd = productService.searchProduct(pid);
		if(prd != null) {
			int rowCount = productService.deleteProduct(pid);
			if(rowCount != 0) {
				model.addAttribute("status", "Product Deleted Successfully...");				
			}else {
				model.addAttribute("status", "Product Not Deleted");
			}
		}else {
			model.addAttribute("status", "Product Not Found...");
		}
				
		return "status";
	}
	
}
