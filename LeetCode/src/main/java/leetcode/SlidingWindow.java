package main.java.leetcode;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Maximum sum of subarray of size " + k + " = " + maxSumSubArray(arr, k));
    }

    public static int maxSumSubArray(int[] nums, int k) {
        int start = 0;
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        int max = windowSum;
        for (int windowEnd = k; windowEnd < nums.length; windowEnd++) {
            windowSum = windowSum + nums[windowEnd] - nums[start];
            start++;
            max = Math.max(max, windowSum);
        }
        return max;
    }
}
