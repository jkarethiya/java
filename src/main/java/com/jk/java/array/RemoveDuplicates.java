package com.jk.java.array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		char[] chars = { 'a', 'a', 'b', 'c', 'c', 'd', 'a', 'c' };
		int duplicates = getNumberOfDuplicates(chars);

		char[] withOutDuplicatesChars = removeDuplicates(chars, duplicates);
		System.out.println(Arrays.toString(withOutDuplicatesChars));
	}

	private static char[] removeDuplicates(char[] chars, int duplicates) {
		char[] newArray = new char[chars.length - duplicates];

		int k = chars.length - duplicates - 1;
		if (duplicates > 0) {
			for (int i = chars.length - 1; i >= 0; i--) {
				boolean yes = false;
				for (int j = 0; j < newArray.length; j++) {
					if (chars[i] == newArray[j]) {
						yes = true;
						break;
					}
				}
				if (yes == false) {
					newArray[k] = chars[i];
					k = k - 1;
				}
			}

			return newArray;
		} else {
			return chars;
		}
	}

	public static int getNumberOfDuplicates(char[] arg) {
		String[] str = new String[arg.length];
		for (int i = 0; i < arg.length; i++) {
			str[i] = String.valueOf(arg[i]);
		}

		System.out.println(Arrays.toString(str));

		Set<String> noDup = new LinkedHashSet<String>(Arrays.asList(str));
		System.out.println(noDup);
		return (arg.length - noDup.size());
	}

}
