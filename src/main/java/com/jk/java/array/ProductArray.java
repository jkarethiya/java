package com.jk.java.array;

import java.util.Arrays;

public class ProductArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productArray(new int[]{1, 7, 3, 4})));
    }

    private static int[] productArray(int[] nums) {
        int[] result = new int[(nums.length)];

        int product = 1;
        int i = 0;

        while (i < nums.length) {
            result[i] = product;
            product = product * nums[i];
            i += 1;
        }


        product = 1;
        i = nums.length - 1;

        while (i >= 0) {
            result[i] = result[i] * product;
            product = product * nums[i];
            i -= 1;
        }

        return result;

    }

}
