package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Orders;
import com.example.demo.Service.OrdersService;

@RestController
@RequestMapping("/api/orders")
public class OrdersController {

	@Autowired
	OrdersService ordersService;
	
	@GetMapping("/readall")
	public List<Orders> readAll(){
		return ordersService.readAll();
	}
	@GetMapping("/readall2")
	public List<Map<String, Object>> readAll2(){
		return ordersService.readAll2();
	}

	@GetMapping("/readall3")
	public List<Map<String, Object>> readAll3(){
		return ordersService.readAll3();

	}
	
}
