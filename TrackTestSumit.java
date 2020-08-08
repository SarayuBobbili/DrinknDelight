package com.cg;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.Entity.Track;
import com.cg.dao.TrackDaoI;
import com.cg.service.TrackProductServiceI;


public class TrackTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	@Mock
	TrackProductServiceI service;
	
	@Mock
	TrackDaoI dao;
	@Rule public MockitoRule rule = MockitoJUnit.rule();
	
	@Test
	public void testTrack()
	{
		Track track = new Track();
		
      when(dao.trackProductOrder(101)).thenReturn(track);
      assertEquals(null, dao.trackProductOrder(101).getCurrentStatus()); 
		
	}
	
	@Test
	public void testTrack1()
	{
		Track track = new Track();
		track.setCurrentStatus("Delivered to your nearby hub");
		
		when(service.trackProductOrder(1001)).thenReturn(track);
		assertEquals("Delivered to your nearby hub", (service.trackProductOrder(1001)).getCurrentStatus()); 
		verify(service).trackProductOrder(1001);
	}
}
