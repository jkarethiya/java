package com.jk.java.array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3 };
		System.out.println("Before Reverse " + Arrays.toString(array));
		int start = 0, end = array.length - 1;

		while (start < end) {
			int temp = array[end];
			array[end] = array[start];
			array[start] = temp;

			start++;
			end--;
		}

		System.out.println("After Reverse " + Arrays.toString(array));
	}

}
