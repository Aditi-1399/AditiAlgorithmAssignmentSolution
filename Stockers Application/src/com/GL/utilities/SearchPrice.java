package com.GL.utilities;

public class SearchPrice {

	// Search method is taking user input and checking whether or not the value is present in the array
	
	public int searchPrice(double key, double prices[]){
		double x = key;
		for(int i = 0; i < prices.length; i++) {
			if (x == prices[i]) 
				return 1;
		}
		return 0;
	}
	
}
