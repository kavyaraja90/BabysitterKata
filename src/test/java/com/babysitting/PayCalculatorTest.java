package com.babysitting;

import static org.junit.Assert.*;

import org.junit.Test;

public class PayCalculatorTest {

	@Test
	public void babysitterGetsPaidCorrectAmountForHoursFromStartTimeToBedTime() {
		int startTime = 18;
		int bedTime = 21;
		int endTime = 23;
		
		int expectedPayment = 3*Pay.START_TIME_TO_BED_TIME.rate;
		
	    BabysittingJob job = new BabysittingJob(18, 23, 21);
	    
	    assertEquals(expectedPayment, job.getPayment());	
	}

}
