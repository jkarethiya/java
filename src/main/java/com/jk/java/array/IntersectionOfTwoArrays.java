package com.jk.java.array;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		System.out.println(intersect(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 }));
		System.out.println(intersect(new int[] { 4,  5, 9 }, new int[] { 9, 4, 9, 8, 4 }));
	}

	private static List<Integer> intersect(int[] a1, int[] a2) {
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> results = new LinkedList<>();

		for (int num : a1) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		for (int num : a2) {
			if (map.containsKey(num) && map.get(num) > 0) {
				results.add(num);
				map.put(num, map.get(num) - 1);
			}
		}

		return results;
	}

}
