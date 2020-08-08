package com.cg;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;
import com.cg.Dao.ProductDao;
import com.cg.Entity.Product;
import com.cg.Service.ProductService;


public class SampleApplicationTests
{

	ProductDao dao = Mockito.mock(ProductDao.class);
	ProductService service= new ProductService(dao);
	
	@Test
	public void  TestOne()
	{
		Product product = new Product();
		product.setProductId("1");
		product.setProductName("official");
		product.setProductPrice(42.5);
		product.setProductQuantity(50.3);
		
		when(dao.findByName("official")).thenReturn(product);
		assertEquals(42.5,service.getproductprice("official"),1);
	}
	
	@Test
	public void  TestTwo()
	{
		Product product = new Product();
		product.setProductId("2");
		product.setProductName("clone");
		product.setProductPrice(36.5);
		product.setProductQuantity(49.5);
		
		when(dao.findByName("clone")).thenReturn(product);
		assertEquals(36.5,service.getproductprice("clone"),1);
	}
	
	@Test
	public void  TestThree()
	{
		Product product = new Product();
		product.setProductId("1");
		product.setProductName("official");
		product.setProductPrice(42.5);
		product.setProductQuantity(50.3);
		
		when(dao.findByName("official")).thenReturn(product);
		assertEquals(50.3,service.getproductquantity("official"),1);
	}
	
	@Test
	public void  TestFour()
	{
		Product product = new Product();
		product.setProductId("1");
		product.setProductName("official");
		product.setProductPrice(42.5);
		product.setProductQuantity(50.3);
		
		when(dao.findByName("official")).thenReturn(product);
		assertEquals("1",service.getproductid("official"));
	}

	@Test
	public void  TestFive()
	{
		Product product = new Product();
		product.setProductId("2");
		product.setProductName("clone");
		product.setProductPrice(36.5);
		product.setProductQuantity(49.5);
		
		when(dao.findByName("clone")).thenReturn(product);
		assertEquals(37.5,service.getproductquantity("clone"),1);
	}
	
	@Test
	public void  TestSix()
	{
		Product product = new Product();
		product.setProductId("2");
		product.setProductName("clone");
		product.setProductPrice(36.5);
		product.setProductQuantity(49.5);
		
		when(dao.findByName("clone")).thenReturn(product);
		assertEquals("3",service.getproductid("clone"));
	}
	
}
