package com.company.math.prime_numbers;

public class FindPrimeNumbersTest {
    public static void main(String[] args) {
        int n = 50;
        Eratosthenes test = new Eratosthenes();
        test.printArray(test.getEratosthenes(n));
    }
}
