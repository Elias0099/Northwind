package com.example.demo.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.Operaciones;
import com.example.demo.DaoImpl.OrdersDaoImpl;
import com.example.demo.Entity.Orders;

@Service
public class OrdersService implements Operaciones<Orders>{

	@Autowired
	OrdersDaoImpl ordaoimpl;
	
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
		return ordaoimpl.readAll();
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return ordaoimpl.readAll2();
	}

	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return ordaoimpl.readAll3();
	}

	
	
}
