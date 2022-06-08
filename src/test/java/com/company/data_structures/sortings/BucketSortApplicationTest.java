package com.company.data_structures.sortings;

public class BucketSortApplicationTest {
    public static void main(String[] args) {
        BucketSort b = new BucketSort();
        float[] arr = {(float) 0.42, (float) 0.32, (float) 0.33, (float) 0.52, (float) 0.37, (float) 0.47,
                (float) 0.51};
        b.bucketSort(arr, 7);

        for (float i : arr)
            System.out.print(i + "  ");
    }
}
