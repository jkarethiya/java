package com.jk.java.array;

public class MinMaxElementFromArray {

	public static void main(String[] args) {
		// int[] array = { 6, 1, 2, 3, -3};
		int array[] = { 1000, 11, 445, 1, 330, 3000 };

		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

		for (int e : array) {
			if (min > e) {
				min = e;
			}

			if (max < e) {
				max = e;
			}
		}

		System.out.println("Min element " + min);
		System.out.println("Max element " + max);
	}

}
