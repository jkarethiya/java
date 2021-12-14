package com.jk.java.array;

import java.util.Arrays;

public class ReverseArrayUsingRecursion {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3 };
		System.out.println("Before Reverse " + Arrays.toString(array));
		int start = 0, end = array.length - 1;

		extracted(array, start, end);

		System.out.println("After Reverse " + Arrays.toString(array));
	}

	private static void extracted(int[] array, int start, int end) {
		if (start > end) {
			return;
		}

		int temp = array[end];
		array[end] = array[start];
		array[start] = temp;

		start++;
		end--;

		extracted(array, start, end);
	}

}
