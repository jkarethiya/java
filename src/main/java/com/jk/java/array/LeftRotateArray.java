package com.jk.java.array;

public class LeftRotateArray {

	public static void main(String[] args) {

		int array[] = { 3, 1, 5, 7 };
		
		leftRotateArray(array, 6);
		
	}

	private static void leftRotateArray(int[] array, int index) {
		int size = array.length;
		
		int startingIndexForNewArray = index % size; 
		
		for(int i = 0; i < size; i ++) {
			System.out.println(array[(i + startingIndexForNewArray) % size]);
		}
	}

}
