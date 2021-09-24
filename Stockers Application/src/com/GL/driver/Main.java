package com.GL.driver;
import java.util.Scanner;

import com.GL.utilities.MergeSort;
import com.GL.utilities.PriceTracking;
import com.GL.utilities.SearchPrice;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		/* Accepting user input
		 * The if condition along with while are used to ensure that user gives non negative input for no. of companies and price.
		 * The number of companies also has to be greater than 0.
		 */

		System.out.println("Enter the number of companies ");
		int n = scan.nextInt();
		if (n <= 0) {
			while(n <= 0) {
				System.out.println("Please enter a number greater than 0");
				n = scan.nextInt();
			}
		}
		double prices[] = new double[n];
		boolean status[] = new boolean[n];
		for (int i = 0 ; i < n ; i++) {
			System.out.println("Please enter current stock price of company "+ (i+1));
			prices[i] = scan.nextDouble();
			if (prices[i] < 0) {
				while(prices[i] < 0) {
					System.out.println("Please enter a number greater than or equal to 0");
					prices[i] = scan.nextInt();
				}
			}
			System.out.println("Whether company's stock prices rose today compared to yesterday ?");
			status[i] = scan.nextBoolean();
		}


		System.out.println();

		// Using while loop to keep repeating operations list

		while (true) {

			System.out.println("Enter the number corresponding to the operation you wqant to perform \n 1.  Display the companies stock prices in ascending order \n 2.  Display the companies stock prices in descending order \n 3. Display the total no of companies for which stock prices rose today \n 4. Display the total no of companies for which stock prices declined today \n 5. Search a specific stock price \n 6. Press 0 to exit ");
			int option = scan.nextInt();

			// Using switch to create object and call required method according to operation selected

			switch (option) {

			// Case 0 is to exit program

			case 0:
				System.exit(1);
				break;

				// Case 1 creates object for sorting class and then calls ascending method and print method to display in ascending order

			case 1:{
				MergeSort obj = new MergeSort();
				obj.sortAscending(prices, 0, prices.length-1);
				System.out.println("Stock prices in Ascending order are : ");
				obj.printSortedArray(prices);
				System.out.println();
				System.out.println("--------------------------------------------------------------------");
				System.out.println();
			}
			break;

			// Case 2 creates object for sorting class and then calls descending method and print method to display in descending order

			case 2: {
				MergeSort obj = new MergeSort();
				obj.sortDescending(prices, 0, prices.length-1);
				System.out.println("Stock prices in Descending order are : ");
				obj.printSortedArray(prices);
				System.out.println();
				System.out.println("--------------------------------------------------------------------");
				System.out.println();
			}
			break;

			// Case 3 creates object of tracking class and calls rise method to display no. of companies who's stock price went up 
			
			case 3: {
				PriceTracking obj = new PriceTracking();
				obj.priceRise(status);
				System.out.println();
				System.out.println("--------------------------------------------------------------------");
				System.out.println();
			}
			break;

			// Case 4 creates object of tracking class and calls decline method to display no. of companies who's stock price went down
			
			case 4: {
				PriceTracking obj = new PriceTracking();
				obj.priceDecline(status);
				System.out.println();
				System.out.println("--------------------------------------------------------------------");
				System.out.println();
			}
			break;

			// Case 5 takes input of value to be searched from user. Then creates object for search class and calls search method to display whether or not value is present
			
			case 5: {
				System.out.println("Please enter the key value to be searched ");
				double key = scan.nextDouble();
				SearchPrice obj = new SearchPrice();
				int check = obj.searchPrice(key, prices);
				if (check == 1)
					System.out.println("Stock of value "+ key + " is present.");
				else
					System.out.println("Value not found.");
				System.out.println();
				System.out.println("--------------------------------------------------------------------");
				System.out.println();
			}
			break;


			default:
				System.out.println("Invalid choice. Enter a valid no.\n");
				System.out.println();
				System.out.println("--------------------------------------------------------------------");
				System.out.println();
			}
		}

	}

}
