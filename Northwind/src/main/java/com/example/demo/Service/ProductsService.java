package com.example.demo.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.Operaciones;
import com.example.demo.DaoImpl.ProductsDaoImpl;
import com.example.demo.Entity.Products;

@Service
public class ProductsService implements Operaciones<Products> {

	@Autowired
	ProductsDaoImpl prodaoimpl;
	
	@Override
	public int create(Products t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Products t, int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Products read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Products> readAll() {
		// TODO Auto-generated method stub
		return prodaoimpl.readAll();
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return prodaoimpl.readAll2();
	}

	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
