package com.company.graph.disjoint;

public class QuickUnion {
    private int[] root;

    public QuickUnion(int size) {
        root = new int[size];
        for (int i = 0; i < size; i++) {
            root[i] = i;
        }
    }

    public int find(int x) {
        while (x != root[x]) {
            x = root[x];
        }
        return x;
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            root[rootY] = rootX;
        }
    }

    public boolean connected(int x, int y) {
        return find(x) == find(y);
    }
}

class QuickUnionApplication {
    public static void main(String[] args) {
        QuickUnion quickUnion = new QuickUnion(10);
        quickUnion.union(1, 2);
        quickUnion.union(2, 5);
        quickUnion.union(5, 6);
        quickUnion.union(6, 7);
        quickUnion.union(3, 8);
        quickUnion.union(8, 9);
        System.out.println(quickUnion.connected(1, 5)); // true
        System.out.println(quickUnion.connected(5, 7)); // true
        System.out.println(quickUnion.connected(4, 9)); // false
    }
}
