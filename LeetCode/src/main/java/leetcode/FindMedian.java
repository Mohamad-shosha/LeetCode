package main.java.leetcode;

import java.util.Arrays;

public class FindMedian {
    public int[] findMedianSortedArrays(int[] nums1, int[] nums2) {
        int lengthOne = 0;
        int lengthTwo = 0;
        int[] mergedArray = new int[nums1.length + nums2.length];
        int newLength = 0;

        while (lengthOne < nums1.length && lengthTwo < nums2.length) {
            if (nums1[lengthOne] < nums2[lengthTwo]) {
                mergedArray[newLength++] = nums1[lengthOne++];
            } else {
                mergedArray[newLength++] = nums2[lengthTwo++];
            }
        }

        while (lengthOne < nums1.length) {
            mergedArray[newLength++] = nums1[lengthOne++];
        }

        while (lengthTwo < nums2.length) {
            mergedArray[newLength++] = nums2[lengthTwo++];
        }

        return mergedArray;
    }

    public double findMedian(int[] nums) {
        int length = nums.length;
        if (length % 2 == 0) {
            return (nums[length / 2 - 1] + nums[length / 2]) / 2.0;
        } else {
            return nums[length / 2];
        }
    }

    public static void main(String[] args) {
        FindMedian obj = new FindMedian();
        int[] merged = obj.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});
        System.out.println(Arrays.toString(merged));
        System.out.println(obj.findMedian(merged));
    }
}
