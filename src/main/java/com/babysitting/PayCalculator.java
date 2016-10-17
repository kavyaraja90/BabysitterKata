package com.babysitting;

public class PayCalculator {

	public static int calculatePaymentForJob(int startTime, int endTime, int bedTime) {
		return Pay.START_TIME_TO_BED_TIME.rate * getHoursTillBedTime(startTime, endTime, bedTime) ;
	}
	
    private static int getHoursTillBedTime(int startTime, int endTime, int bedTime) {
        if (endTime < bedTime) {
            return endTime - startTime;
        }
        return bedTime - startTime;
    }


}
