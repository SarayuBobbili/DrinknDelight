package com.cg.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.Mockito.*;

import com.cg.dao.UserLoginDao;
import com.cg.entities.User;
import com.cg.service.UserLoginService;

public class Testing {
		UserLoginDao dao=Mockito.mock(UserLoginDao.class);
		UserLoginService service=new UserLoginService(dao);
	@Test
	public void addTest()
	{
		User user=new User();
		user.setUsername("Admin");
		user.setPassword("Admin@123");
		user.setRole("ADMIN");
		when(dao.getUserByUserName("Admin")).thenReturn(user);
		assertEquals("ADMIN LOGIN",service.login("Admin", "Admin@123") );
	} 
	@Test
	public void addTest1()
	{
		User user=new User();
		user.setUsername("Customer");
		user.setPassword("Customer@123");
		user.setRole("CUSTOMER");
		when(dao.getUserByUserName("Customer")).thenReturn(user);
		assertEquals("CUSTOMER LOGIN",service.login("Customer", "Customer@123") );
		//verify(service.login("teja", "teja@123"));
	}
//	@Test
//	public void addTest2()
//	{
//		User user=new User();
//		user.setUsername("Teja");
//		user.setPassword("Teja@123");
//		user.setRole("CUSTOMER");
//		when(dao.getUserByUserName("Teja")).thenReturn(user);
//		assertEquals("ADMIN LOGIN",service.login("Teja", "Teja@123"));
//		//verify(service.login("teja", "teja@123"));
//	}
	
	@Test
	public void addTest3()
	{
		User user=new User();
		user.setUsername("Customer");
		user.setPassword("Customer@123");
		user.setRole("ADMIN");
		when(dao.getUserByUserName("Customer")).thenReturn(user);
		assertEquals("NOT VALID",service.login("Customer", "Customer1@123") );
		//verify(service.login("teja", "teja@123"));
	}
	@Test
	public void addTest4()
	{
		User user=new User();
		user.setUsername("sai");
		user.setPassword("Sai@123");
		user.setRole("ADMIN");
		List<User> userlist=new ArrayList<>();
		userlist.add(user);
		
		when(dao.addUser(user)).thenReturn(userlist);
		assertEquals("ADDED",service.signUp(user, "sai") );
		//verify(service.login("teja", "teja@123"));
	}
	
	
}
