package com.jk.java.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicates {

    public static void main(String[] args) {
        System.out.println(findDuplicates(new int[]{1, 2, 2, 1, 3}));
        System.out.println(findDuplicatesUsingMap(new int[]{4, 3, 2, 2, 8}));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        int n;
        int valAtIndex;
        List<Integer> ans = new ArrayList<Integer>();
        // [4,3,2,7,8,2,3,1]
        // idea here we iterate the num array and mark the value at num[num[i]] to be
        // negative, if we see any negative value while iteration it means we have
        // already visited it
        for (int i = 0; i < nums.length; i++) {
            n = nums[i];
            n = Math.abs(n);
            valAtIndex = nums[n - 1];
            if (valAtIndex > 0) {
                nums[n - 1] = -1 * valAtIndex;
            } else {
                ans.add(n);
            }
        }
        return ans;
    }

    public static List<Integer> findDuplicatesUsingMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.merge(num, 1, Integer::sum);

            /*
            Integer count = map.get(num);
            if (count == null) {
                map.put(num, 1);
            } else {
                map.put(num, count + 1);
            }
            */
        }

        return map.entrySet().stream().filter(e -> e.getValue() > 1).map(e -> e.getKey()).collect(Collectors.toList());
    }

}
