package com.babysitting;
import exception.NotAvailableException;

import static org.junit.Assert.*;

import org.junit.Test;

public class BabysittingJobTest {

    @Test(expected = NotAvailableException.class)
    public void babySitterDoesNotAcceptInvalidStartTimeAndThrowsNotAvailableException() {
        new BabysittingJob(12, 2, BabysittingJob.DEFAULT_BEDTIME);
    }
    
    @Test(expected = NotAvailableException.class)
    public void babySitterDoesNotAcceptInvalidEndTimeAfter4AM() {
    	new BabysittingJob(12,5, BabysittingJob.DEFAULT_BEDTIME);  	
    }
    
    @Test
    public void babySittingJobIsCreatedWhenValidStartAndEndTimesAreSpecified(){
    	BabysittingJob job = new BabysittingJob(18, 3, 20);
    	assertEquals(18, job.getStartTime());
    	assertEquals(3, job.getEndTime());
    	assertEquals(20, job.getBedtime());	
    }

}
