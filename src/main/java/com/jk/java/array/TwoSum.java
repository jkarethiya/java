package com.jk.java.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(new int[] { 1, 2, 2, 1 }, 4)));
		System.out.println(Arrays.toString(twoSum(new int[] { 2, 7, 11, 15 }, 13)));
	}

	private static int[] twoSum(int[] numbers, int target) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < numbers.length; i++) {
			int x = numbers[i];
			
			Integer value = map.get(target - x);
			if (value != null) {
				return new int[] {value , i };
			}
			map.put(x, i);
		}

		throw new IllegalArgumentException("No two sum solution exist for gievn target");
	}

}