package com.company.data_structures.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MiniMaxSumTest {

    public static void miniMaxSum(List<Integer> arr) {
        // Collections.sort using merge sort algorithms.
        Collections.sort(arr);
        System.out.println(arr);
        long min = Long.valueOf(arr.get(0)) + Long.valueOf(arr.get(1)) + Long.valueOf(arr.get(2)) + Long.valueOf(arr.get(3));
        long max = Long.valueOf(arr.get(arr.size() - 1)) +  Long.valueOf(arr.get(arr.size() - 2)) +  Long.valueOf(arr.get(arr.size() - 3)) +  Long.valueOf(arr.get(arr.size() - 4));
        String res = String.valueOf(min) + " " + String.valueOf(max);
        System.out.print(res);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        miniMaxSum(arr);

        bufferedReader.close();
    }
}
