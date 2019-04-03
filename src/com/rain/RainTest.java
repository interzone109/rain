package com.rain;


import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class RainTest {

	
	@Test
	public void testInnerFill() {
	Algorithm rain = new Algorithm();
	int [] test = {1,9,4,1,4,8,1};
	rain.setArray(test);
	int  result = rain.rainIsComing(3) ;
	
	assertEquals(15, result);
	}
	
	@Test
	public void testTopFill() {
	Algorithm rain = new Algorithm();
	int [] test = {1,9,4,11,4,8,1};
	rain.setArray(test);
	
	int  result = rain.rainIsComing(3) ;
	
	assertEquals(9, result);
	}
	
	@Test
	public void testEmptyFill() {
	Algorithm rain = new Algorithm();
	int [] test = {8,9,10,11,10,9,8};
	rain.setArray(test);
	
	int  result = rain.rainIsComing(3) ;
	
	assertEquals(0, result);
	}
	
	@Test
	public void testLeftFill() {
	Algorithm rain = new Algorithm();
	int [] test = {1,3,4,5,2,3,1};
	rain.setArray(test);
	
	int  result = rain.rainIsComing(3) ;
	
	assertEquals(1, result);
	}
	
	@Test
	public void testRightFill() {
	Algorithm rain = new Algorithm();
	int [] test = {1,9,4,11,4,3,1};
	rain.setArray(test);
	
	int  result = rain.rainIsComing(3) ;
	
	assertEquals(5, result);
	}

	@Test
	public void testFill() {
	Algorithm rain = new Algorithm();
	int [] test = {4,2,3,1,4,5,4};
	rain.setArray(test);
	
	int  result = rain.rainIsComing(3) ;
	
	assertEquals(6, result);
	}
	
	
}
