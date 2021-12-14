package com.jk.java.array;

import java.util.ArrayList;

public class SubarraySum {
	/*
	 * Returns true if the there is a subarray of arr[] with a sum equal to 'sum'
	 * otherwise returns false. Also, prints the result
	 */
	int subArraySum(int arr[], int sum) {
		int curr_sum, i, j;
		int n = arr.length;
		ArrayList<Integer> result = new ArrayList<>();

		// Pick a starting point
		for (i = 0; i < n; i++) {
			result = new ArrayList<>();
			curr_sum = arr[i];

			// try all subarrays starting with 'i'
			for (j = i + 1; j <= n; j++) {
				if (curr_sum == sum) {
					System.out.println("Sum found between indexes " + i + " and " + (j - 1));
					return 1;
				}

				if (curr_sum > sum) {
					System.out.println("Breaking inner loop because curr_sum > sum");
					break;
				}

				if (j == n) {
					System.out.println("Breaking inner loop because j == n");
					break;
				}

				curr_sum = curr_sum + arr[j];
				result.add(j);
			}
		}

		System.out.println("No subarray found");
		return 0;
	}

	public static void main(String[] args) {
		SubarraySum arraysum = new SubarraySum();

		arraysum.subArraySum(new int[] { 15, 2, 4, 8, 9, 5, 10, 23 }, 23);
		arraysum.subArraySum(new int[] { 1, 4, 20, 3, 10, 5 }, 33);
		arraysum.subArraySum(new int[] { 1, 4, 0, 0, 3, 10, 5 }, 7);
		arraysum.subArraySum(new int[] { 1, 4 }, 0);
	}
}