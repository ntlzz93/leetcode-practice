package com.company.graph.disjoint.problems;

import com.company.graph.disjoint.OptimizedDisjointSet;

public class NumberOfProvinces {
    public static void main(String[] args) {
        int[][] isConnected1 = new int[3][3];
        int[][] isConnected2 = new int[3][3];
        isConnected1[0][0] = 1;
        isConnected1[0][1] = 1;
        isConnected1[0][2] = 0;
        isConnected1[1][0] = 1;
        isConnected1[1][1] = 1;
        isConnected1[1][2] = 0;
        isConnected1[2][0] = 0;
        isConnected1[2][1] = 0;
        isConnected1[2][2] = 1;
        isConnected2[0][0] = 1;
        isConnected2[0][1] = 0;
        isConnected2[0][2] = 0;
        isConnected2[1][0] = 0;
        isConnected2[1][1] = 1;
        isConnected2[1][2] = 0;
        isConnected2[2][0] = 0;
        isConnected2[2][1] = 0;
        isConnected2[2][2] = 1;
        NumberOfProvinces numberOfProvinces = new NumberOfProvinces();
        System.out.println(numberOfProvinces.findCircleNum(isConnected1));
        System.out.println(numberOfProvinces.findCircleNum(isConnected2));
    }

    public int findCircleNum(int[][] isConnected) {
        OptimizedDisjointSet disjointSet = new OptimizedDisjointSet(isConnected.length);
        for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected.length; j++) {
                if (isConnected[i][j] == 1) {
                    disjointSet.union(i, j);
                }
            }
        }
        int count = 0;
        for (int i = 0; i < isConnected.length; i++) {
            if (i != 0 && disjointSet.connected(0, i)) {
                count++;
            }
        }

        return isConnected.length - count;
    }
}
