package com.example.demo.Entity;

import java.io.Serializable;

public class Products implements Serializable {

	private static final long serialVersionUID = 1L;
	private int ProductID;
	private String ProductName;
	private int SupplierID;
	private int CategoryID;
	private String QuantityPerUnit;
	private double UnitPrice;
	private int UnitsInStock;
	private int UnitsOnOrder;
	private int ReorderLevel;
	private int Discontinued;
	
	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int productID) {
		ProductID = productID;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getSupplierID() {
		return SupplierID;
	}
	public void setSupplierID(int supplierID) {
		SupplierID = supplierID;
	}
	public int getCategoryID() {
		return CategoryID;
	}
	public void setCategoryID(int categoryID) {
		CategoryID = categoryID;
	}
	public String getQuantityPerUnit() {
		return QuantityPerUnit;
	}
	public void setQuantityPerUnit(String quantityPerUnit) {
		QuantityPerUnit = quantityPerUnit;
	}
	public double getUnitPrice() {
		return UnitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		UnitPrice = unitPrice;
	}
	public int getUnitsInStock() {
		return UnitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		UnitsInStock = unitsInStock;
	}
	public int getUnitsOnOrder() {
		return UnitsOnOrder;
	}
	public void setUnitsOnOrder(int unitsOnOrder) {
		UnitsOnOrder = unitsOnOrder;
	}
	public int getReorderLevel() {
		return ReorderLevel;
	}
	public void setReorderLevel(int reorderLevel) {
		ReorderLevel = reorderLevel;
	}
	public int getDiscontinued() {
		return Discontinued;
	}
	public void setDiscontinued(int discontinued) {
		Discontinued = discontinued;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
