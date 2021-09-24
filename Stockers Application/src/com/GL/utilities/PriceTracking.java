package com.GL.utilities;

public class PriceTracking {
	int rise = 0;
	int decline = 0;
	
	// Track method is counting both no of cases where price increases and cases where price decreases
	
	public void priceTrack(boolean status[]) {
		for(int i = 0 ; i < status.length ; i++) {
			if (status[i]== true)
				rise ++ ;
			else
				decline ++;
		}
	}
	
	// Rise method is printing the value of counter rise which stores no. of companies who's stock price has gone up
	
	public void priceRise(boolean status[]) {
		priceTrack(status);
		System.out.println("Total no of companies whose stock price rose today : "+ rise);
	}
	
	// Decline method is printing the value of counter decline which stores no. of companies who's stock price has gone down
	
	public void priceDecline(boolean status[]) {
		priceTrack(status);
		System.out.println("Total no of companies whose stock price declined today : "+ decline);
	}
	
}
