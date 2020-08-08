package com.cg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.cg.dao.SupplierDaoImpl;
import com.cg.service.SupplierServiceImpl;

class TestCase {


	SupplierDaoImpl sdao=Mockito.mock(SupplierDaoImpl.class);
	SupplierServiceImpl service=new SupplierServiceImpl(sdao);
	
	
	@Test
	public void checkSupplier()
	{
		when(sdao.Find(1001)).thenReturn(1001);
		assertEquals(1001, service.Find(1001));
	}

	@Test
	public void checkId()
	{
		when(sdao.Id(101)).thenReturn("valid");
		assertEquals("valid", service.Id(101));
	}

	@Test
	public void checkName()
	{
		when(sdao.Id(1001)).thenReturn("Sumit");
		assertEquals("Sumit", service.Id(101));
	}

}
