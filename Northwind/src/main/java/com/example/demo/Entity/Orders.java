package com.example.demo.Entity;

import java.io.Serializable;

public class Orders implements Serializable{

	private static final long serialVersionUID = 1L;
	private int OrderID;
	private String CustomerID;
	private int EmployeeID;
	private String OrderDate;
	private String RequiredDate;
	private String ShippedDate;
	private int ShipVia;
	private double Freight;
	private String ShipName;
	private String ShipAddress;
	private String ShipCity;
	private String ShipRegion;
	private String ShipPostalCode;
	private String ShipCountry;
	
	public int getOrderID() {
		return OrderID;
	}
	public void setOrderID(int orderID) {
		OrderID = orderID;
	}
	public String getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}
	public int getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}
	public String getOrderDate() {
		return OrderDate;
	}
	public void setOrderDate(String orderDate) {
		OrderDate = orderDate;
	}
	public String getRequiredDate() {
		return RequiredDate;
	}
	public void setRequiredDate(String requiredDate) {
		RequiredDate = requiredDate;
	}
	public String getShippedDate() {
		return ShippedDate;
	}
	public void setShippedDate(String shippedDate) {
		ShippedDate = shippedDate;
	}
	public int getShipVia() {
		return ShipVia;
	}
	public void setShipVia(int shipVia) {
		ShipVia = shipVia;
	}
	public double getFreight() {
		return Freight;
	}
	public void setFreight(double freight) {
		Freight = freight;
	}
	public String getShipName() {
		return ShipName;
	}
	public void setShipName(String shipName) {
		ShipName = shipName;
	}
	public String getShipAddress() {
		return ShipAddress;
	}
	public void setShipAddress(String shipAddress) {
		ShipAddress = shipAddress;
	}
	public String getShipCity() {
		return ShipCity;
	}
	public void setShipCity(String shipCity) {
		ShipCity = shipCity;
	}
	public String getShipRegion() {
		return ShipRegion;
	}
	public void setShipRegion(String shipRegion) {
		ShipRegion = shipRegion;
	}
	public String getShipPostalCode() {
		return ShipPostalCode;
	}
	public void setShipPostalCode(String shipPostalCode) {
		ShipPostalCode = shipPostalCode;
	}
	public String getShipCountry() {
		return ShipCountry;
	}
	public void setShipCountry(String shipCountry) {
		ShipCountry = shipCountry;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
