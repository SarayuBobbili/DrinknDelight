package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PrintReviewMock {
	
	@Test
	public void mockTesting1() {
		ReviewService doService = mock(ReviewService.class);
		List<String> combinedlist = Arrays.asList(" Very good ", " Good ", " Excellent ", " Not nice "); 
		when(doService.getReview(1001)).thenReturn(combinedlist);
		
		PrintReview print = new PrintReview(doService);
		List<String> all = print.getReviewForSpring(1001);
		
		System.out.println(all);
		assertEquals(1, all.size());
	}

}
