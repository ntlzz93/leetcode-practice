package com.company.math.prime_numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Eratosthenes {

    public int[] getEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        List<Integer> result = new ArrayList<>();

        for (int p = 2; p * p < n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                result.add(i);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    public void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
