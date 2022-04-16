package com.company.graph.disjoint;

import java.time.Instant;

public class QuickFind {
    private int[] root;

    public QuickFind(int size) {
        root = new int[size];
        for (int i = 0; i < size; i++) {
            root[i] = i;
        }
    }

    public int find(int x) {
        return root[x];
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            for (int i = 0; i < root.length; i++) {
                if (root[i] == rootY) {
                    root[i] = rootX;
                }
            }
        }
    }

    public boolean connected(int x, int y) {
        return find(x) == find(y);
    }
}

class QuickFindApplication {
    public static void main(String[] args) throws Exception {
        Long startTime = Instant.now().toEpochMilli();
        QuickFind uf = new QuickFind(10);
        // 1-2-5-6-7 3-8-9 4
        uf.union(1, 2);
        uf.union(2, 5);
        uf.union(5, 6);
        uf.union(6, 7);
        uf.union(3, 8);
        uf.union(8, 9);
        System.out.println(uf.connected(1, 5)); // true
        Long endTime = Instant.now().toEpochMilli();
        Long duration = (endTime - startTime);
        System.out.println(duration);
    }
}
