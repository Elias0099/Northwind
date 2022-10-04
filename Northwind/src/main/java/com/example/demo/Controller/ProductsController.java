package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Products;
import com.example.demo.Service.ProductsService;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	@Autowired
	ProductsService productsService;
	
	@GetMapping("/readall")
	public List<Products> readAll(){
		return productsService.readAll();
	}
	@GetMapping("/readall2")
	public List<Map<String, Object>> readAll2(){
		return productsService.readAll2();
	}

}
