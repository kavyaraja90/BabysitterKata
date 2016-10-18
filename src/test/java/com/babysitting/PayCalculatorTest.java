package com.babysitting;

import static org.junit.Assert.*;

import org.junit.Test;

import enums.Pay;

public class PayCalculatorTest {

	@Test
	public void babysitterGetsPaidCorrectAmountForHoursFromStartTimeToBedTime() {
		int startTime = 18;
		int bedTime = 21;
		int endTime = 21;
		
		int expectedPayment = 3*Pay.START_TIME_TO_BED_TIME.getRate();
		
	    BabysittingJob job = new BabysittingJob(startTime, endTime, bedTime);
	    
	    assertEquals(expectedPayment, job.getPayment());	
	}
	
	@Test
	public void babysitterGetsPaidCorrectAmountForHoursFromBedTimeToMidnight() {
		int startTime = 21;
		int bedTime = 21;
		int endTime = 23;
		
		int expectedPayment = 2*Pay.BED_TIME_TO_MIDNIGHT.getRate();
		
		BabysittingJob job = new BabysittingJob(startTime, endTime, bedTime);
		 
	    assertEquals(expectedPayment, job.getPayment());	
	}
	
	@Test
	public void babysitterGetsPaidCorrectAmountForHoursFromMidnightToEndTime() {
		int startTime = 0;
		int bedTime = 21;
		int endTime = 3;
		
		int expectedPayment = 3*Pay.START_TIME_TO_BED_TIME.getRate();
		
		BabysittingJob job = new BabysittingJob(startTime, endTime, bedTime);
		 
	    assertEquals(expectedPayment, job.getPayment());	
	}
	
	

}
