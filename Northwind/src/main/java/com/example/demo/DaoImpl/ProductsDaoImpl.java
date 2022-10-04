package com.example.demo.DaoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.Dao.Operaciones;
import com.example.demo.Entity.Products;

@Component

public class ProductsDaoImpl implements Operaciones<Products> {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
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
		return jdbcTemplate.query("SELECT * FROM Products", new BeanPropertyRowMapper<Products>(Products.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String SQL = "SELECT p.ProductID \"ProductoId\",p.ProductName \"Nombre\", c.CategoryID \"CategoriaId\", p.QuantityPerUnit \"Cantidad por Unidad\", p.UnitsInStock \"Unidades en Stock\"\r\n"
				+ "from products as p join categories as c on p.CategoryID=c.CategoryID;";
		return jdbcTemplate.queryForList(SQL);
	}

	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
