package main.java.com.company.data_structures.arrays.excercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxConsecutive {
    public int findMaxConsecutiveOnes(int[] nums) {
        Map<Integer, List<Integer>> mapConsecutive = new HashMap<>();
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            List<Integer> integers = mapConsecutive.get(start);
            if (nums[i] == 1) {
                if (integers == null) {
                    integers = new ArrayList<>();
                }
                if (mapConsecutive.get(start) == null) {
                    start = i;
                }
                if (start == -1) {
                    start = i;
                }
                integers.add(i);
                mapConsecutive.put(start, integers);
            }
            if (nums[i] == 0) {
                integers = new ArrayList<>();
                start = -1;
            }
        }
        if (mapConsecutive.values().size() == 0) {
            return 0;
        }
        return mapConsecutive.values().stream().max(Comparator.comparingInt(List::size)).get().size();
    }
}
