package com.company.data_structures.challenge;

import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecordsTest {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        List<Integer> res = new ArrayList<>();
        int min = scores.get(0);
        int max = scores.get(0);
        int countMin = 0;
        int countMax = 0;
        for (int i = 0;i<scores.size(); i++) {
            if (scores.get(i) < min) {
                min = scores.get(i);
                countMin++;
            } else if (scores.get(i) > max) {
                max = scores.get(i);
                countMax++;
            }
        }

        res.add(countMax);
        res.add(countMin);
        return res;
    }


    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        input.add(12);
        input.add(24);
        input.add(10);
        input.add(24);
        System.out.println(breakingRecords(input));
    }
}
