package main.java.leetcode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,8,0,0,0} ;
        int[] nums2 = {3,7,4};
        int[] array2 = Arrays.stream(nums2).sorted().toArray();
        int m = 3;
        int n = 3;
        System.out.println(Arrays.toString(merge(nums1, m, array2, n)));
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int mi = m - 1;
        int ni = n - 1;
        int r = m + n - 1;
        while (ni >= 0) {
            if (mi < 0) {
                nums1[r--] = nums2[ni--];
            } else if (nums2[ni] >= nums1[mi]) {
                nums1[r--] = nums2[ni--];
            } else if (nums2[ni] < nums1[mi]) {
                nums1[r--] = nums1[mi--];
            }
        }
        return nums1;
    }
}
