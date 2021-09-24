package com.GL.utilities;

public class MergeSort {

	public void mergeAscending(double prices[], int left, int mid, int right) {
		// Find sizes of two sub arrays to be merged
		int n1 = mid - left + 1;
		int n2 = right - mid;

		/* Create temporary arrays */
		double leftArray[] = new double [n1];
		double rightArray[] = new double [n2];

		/* Copy data to temporary arrays */
		for (int i = 0 ; i < n1 ; ++i)
			leftArray[i] = prices[left + i];
		for (int j = 0 ; j < n2 ; ++j)
			rightArray[j] = prices[mid + 1 + j];

		/* Merge the temporary arrays */

		// Initial indexes of first and second sub-arrays
		int i = 0, j = 0;

		// Initial index of merged sub-array array
		int k = left;
		while (i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				prices[k] = leftArray[i];
				i++;
			} else {
				prices[k] = rightArray[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			prices[k] = leftArray[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			prices[k] = rightArray[j];
			j++;
			k++;
		}
	}

	public void sortAscending(double prices[], int left, int right) {
		if (left < right) {
			// Find the middle point
			int mid = (left + right) / 2;

			// Sort first and second halves
			sortAscending(prices, left, mid);
			sortAscending(prices, mid + 1, right);

			// Merge the sorted halves
			mergeAscending(prices, left, mid, right);

		}
	}


	public void mergeDescending(double prices[], int left, int mid, int right) {
		// Find sizes of two sub arrays to be merged
		int n1 = mid - left + 1;
		int n2 = right - mid;

		/* Create temporary arrays */
		double leftArray[] = new double [n1];
		double rightArray[] = new double [n2];

		/* Copy data to temporary arrays */
		for (int i = 0 ; i < n1 ; ++i)
			leftArray[i] = prices[left + i];
		for (int j = 0 ; j < n2 ; ++j)
			rightArray[j] = prices[mid + 1 + j];

		/* Merge the temporary arrays */

		// Initial indexes of first and second sub-arrays
		int i = 0, j = 0;

		// Initial index of merged sub-array array
		int k = left;
		while (i < n1 && j < n2) {
			if (leftArray[i] >= rightArray[j]) {
				prices[k] = leftArray[i];
				i++;
			} else {
				prices[k] = rightArray[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			prices[k] = leftArray[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			prices[k] = rightArray[j];
			j++;
			k++;
		}
	}

	public void sortDescending(double prices[], int left, int right) {
		if (left < right) {
			// Find the middle point
			int mid = (left + right) / 2;

			// Sort first and second halves
			sortDescending(prices, left, mid);
			sortDescending(prices, mid + 1, right);

			// Merge the sorted halves
			mergeDescending(prices, left, mid, right);
		}
	}

	public void printSortedArray(double prices[]) {
		for(int i = 0 ; i < prices.length ; i++) {
			System.out.print(prices[i]+"\t");
		}
		System.out.println();
	}

}