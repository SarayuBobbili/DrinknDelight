package com.cg.dad;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.cg.dao.CartDao;
import com.cg.service.CartService;

public class CartTest {
	
	@Test
	public void mockTesting1() {
		CartService doService = mock(CartService.class);
		List<String> combinedlist = Arrays.asList("Milk shake", "Sprite", "Badam shake"); 
		when(doService.getCart(95)).thenReturn(combinedlist);
		
		CartDao print = new CartDao(doService);
		List<String> all = print.getCart(95);
		
		System.out.println(all);
		//assertEquals(expected, actual);
		
	}

}
