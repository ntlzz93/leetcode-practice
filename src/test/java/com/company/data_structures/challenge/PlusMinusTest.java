package com.company.data_structures.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PlusMinusTest {

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        float positiveCount = 0;
        float negativeCount = 0;
        float zeroCount = 0;
        for (int i =0 ;i<arr.size(); i++) {
            if (arr.get(i) > 0) {
                positiveCount++;
            }else if (arr.get(i) == 0) {
                zeroCount++;
            }else {
                negativeCount++;
            }
        }
        System.out.printf("%.6f%n", positiveCount / arr.size());
        System.out.printf("%.6f%n", negativeCount / arr.size());
        System.out.printf("%.6f%n", zeroCount / arr.size());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        plusMinus(arr);

        bufferedReader.close();
    }
}
