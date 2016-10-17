package com.babysitting;

import exception.NotAvailableException;

public class BabysittingJob {

	public static final int EARLIEST_START_TIME = 17;
	public static final int LATEST_END_TIME = 4;
	public static final int DEFAULT_BEDTIME = 21;

	public static final String START_TIME_UNAVAILABLE_MESSAGE = "Please specify a start time after 5PM and before 4AM";
	public static final String END_TIME_INVALID_MESSAGE = "Please specify an end time, "
			+ "greater than the start time and before 4AM";
	public static final String BEDTIME_INVALID_MESSAGE = "Bedtime needs to be between the start time and end time";

	int startTime;
	int endTime;
	int bedTime;

	BabysittingJob() {
		this.startTime = EARLIEST_START_TIME;
		this.endTime = LATEST_END_TIME;
		this.bedTime = DEFAULT_BEDTIME;
	}

	BabysittingJob(int startTime, int endTime, int bedTime) {
		validateTimeSlot(startTime, endTime, bedTime);
     	this.startTime = startTime;
		this.endTime = endTime;
		this.bedTime = bedTime;

	}

	private void validateTimeSlot(int startTime, int endTime, int bedTime) {
		if (startTime < EARLIEST_START_TIME && startTime > LATEST_END_TIME) {
			throw new NotAvailableException(START_TIME_UNAVAILABLE_MESSAGE);
		} else if (endTime < EARLIEST_START_TIME && endTime > LATEST_END_TIME) {
			throw new NotAvailableException(END_TIME_INVALID_MESSAGE);
		} else if (bedTime < startTime || bedTime > endTime) {
			throw new NotAvailableException(BEDTIME_INVALID_MESSAGE);		
		}
	}
	
	public int getStartTime() {
		return startTime;
	}

	public Object getEndTime() {
		return endTime;
	}

	public Object getBedtime() {
		return bedTime;
	}
}
