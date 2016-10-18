package com.babysitting;

public class PayCalculator {

	public static int calculatePaymentForJob(int startTime, int endTime, int bedTime) {
		return Pay.START_TIME_TO_BED_TIME.rate * getHoursTillBedTime(startTime, endTime, bedTime) + Pay.BED_TIME_TO_MIDNIGHT.rate * getHoursBetweenBedTimeAndMidnight(endTime, bedTime)
		+ Pay.MIDNIGHT_TO_END_TIME.rate * getHoursBetweenMidnightAndEnd(endTime);
	}
   
	private static int getHoursTillBedTime(int startTime, int endTime, int bedTime) {
        if (endTime < bedTime) {
            return endTime - startTime;
        }
        return bedTime - startTime;
    }
	
	private static int getHoursBetweenBedTimeAndMidnight(int endTime, int bedTime) {
        if (endTime < bedTime) {
            return 0;
        }
        if (endTime < 24) {
            return endTime - bedTime;
        }
        return 24 - bedTime;
    }
	
	private static int getHoursBetweenMidnightAndEnd(int endTime) {
        if (endTime <= 24) {
            return 0;
        }
        return endTime - 24;
    }


}
