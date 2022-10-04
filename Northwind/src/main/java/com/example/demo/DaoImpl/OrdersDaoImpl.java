package com.example.demo.DaoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.Dao.Operaciones;
import com.example.demo.Entity.Orders;

@Component
public class OrdersDaoImpl implements Operaciones<Orders>{

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Orders t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Orders t, int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Orders read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Orders> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM Orders", new BeanPropertyRowMapper<Orders>(Orders.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String SQL = "select o.ShipCountry , count(*) as cantidad\r\n"
				+ "    from orders as o\r\n"
				+ "group by ShipCountry;";
		return jdbcTemplate.queryForList(SQL);
	}

	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		String SQL = "SELECT o.OrderID, o.OrderDate, o.RequiredDate, o.ShipName from orders as o;";
		return jdbcTemplate.queryForList(SQL);
	}

	
	
}
