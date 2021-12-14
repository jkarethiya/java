package com.jk.java.array;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesUsingArrayList {

	public static void main(String[] args) {
		int[] array = { 1, 1, 2, 3, 3, 4, 1, 3 };
		removeDuplicates(array);
	}

	public static void removeDuplicates(int[] arg) {
		Set<Integer> chars = new LinkedHashSet<>();

		for (int i = 0; i < arg.length; i++) {
			int temp = arg[i];
			if (chars.contains(temp)) {
				chars.remove(Integer.valueOf(temp));
			}

			chars.add(temp);
		}

		System.out.println(chars);
	}

}
