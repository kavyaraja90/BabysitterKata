package com.babysitting;
import exception.NotAvailableException;

import static org.junit.Assert.*;

import org.junit.Test;

public class BabysittingJobTest {

    @Test(expected = NotAvailableException.class)
    public void babySitterDoesNotAcceptInvalidStartTimeAndThrowsNotAvailableException() {
        new BabysittingJob(12, 2, BabysittingJob.DEFAULT_BEDTIME);
    }
    

}
