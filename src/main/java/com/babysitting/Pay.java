package com.babysitting;

public enum Pay {
	START_TIME_TO_BED_TIME(12),
	BED_TIME_TO_MIDNIGHT(8),
	MIDNIGHT_TO_END_TIME(16);
	
	int rate;
	
	Pay(int rate){
		this.rate = rate;
	}
}
