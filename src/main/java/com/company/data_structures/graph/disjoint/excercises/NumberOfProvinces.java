package com.company.data_structures.graph.disjoint.excercises;

import com.company.data_structures.graph.disjoint.OptimizedDisjointSet;

public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        OptimizedDisjointSet disjointSet = new OptimizedDisjointSet(isConnected.length);
        for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected.length; j++) {
                if (isConnected[i][j] == 1) {
                    disjointSet.union(i, j);
                }
            }
        }
        return disjointSet.getCount();
    }
}
