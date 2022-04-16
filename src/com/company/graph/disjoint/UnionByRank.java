package com.company.graph.disjoint;

public class UnionByRank {
    private int[] root;
    private int[] rank;

    public UnionByRank(int size) {
        root = new int[size];
        rank = new int[size];
        for (int i = 0; i < size; i++) {
            root[i] = i;
            rank[i] = 1;
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
            if (rank[rootX] > rank[rootY]) {
                root[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                root[rootX] = rootY;
            } else {
                root[rootY] = rootX;
                rank[rootX] += 1;
            }
        }
    }

    public boolean connected(int x, int y) {
        return find(x) == find(y);
    }
}

class UnionByRankApplication {
    public static void main(String[] args) {
        UnionByRank unionByRank = new UnionByRank(10);
        // 1-2-5-6-7 3-8-9 4
        unionByRank.union(1, 2);
        unionByRank.union(2, 5);
        unionByRank.union(5, 6);
        unionByRank.union(6, 7);
        unionByRank.union(3, 8);
        unionByRank.union(8, 9);
        System.out.println(unionByRank.connected(1, 5)); // true
        System.out.println(unionByRank.connected(5, 7)); // true
        System.out.println(unionByRank.connected(4, 9)); // false
        // 1-2-5-6-7 3-8-9-4
        unionByRank.union(9, 4);
        System.out.println(unionByRank.connected(4, 9)); // true
    }
}
