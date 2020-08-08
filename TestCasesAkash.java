package com.cg.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.cg.entity.Product;
import com.cg.entity.ProductDao;
import com.cg.entity.ProductService;

public class Testing {
	
		ProductDao dao=Mockito.mock(ProductDao.class);
		ProductService service=new ProductService(dao);
	@Test
	public void addTest()
	{
		Product product=new Product();
		product.setProductName("milkshake");
		product.setProductId(45);
		product.setProductQuantity(3);
		List<Product> productlist=new ArrayList<Product>();
		productlist.add(product);
		when(dao.addProduct(product)).thenReturn(productlist);
		assertEquals("ADDED",service.add(product, "milkshake"));
		//passed
	} 
	
	@Test
	public void addTest1()
	{
		Product product=new Product();
		product.setProductName("coffee");
		product.setProductId(45);
		product.setProductQuantity(3);
		List<Product> productlist=new ArrayList<Product>();
		productlist.add(product);
		when(dao.addProduct(product)).thenReturn(productlist);
		assertEquals("ADDED",service.add(product, "milkshake"));
		//failed
	} 
	
	@Test
	public void addTest2()
	{
		Product product=new Product();
		product.setProductName("coffee");
		product.setProductId(45);
		product.setProductQuantity(3);
		List<Product> productlist=new ArrayList<Product>();
		productlist.add(product);
		when(dao.addProduct(product)).thenReturn(productlist);
		assertEquals("NOT ADDED",service.add(product, "milkshake"));
		//Passed
	} 
	

	
	
	
}




