package main.java.gfg.slidingwindow.maxsumsubarray;

public class Solution {
    public static int maxSubarraySum(int[] arr, int k) {
        int leftOfWindow = 0;
        int sumOfWindow = 0;
        int max = 0;
        for (int i = 0; i < k; i++) {
            sumOfWindow += arr[i];
        }
        max = sumOfWindow;

        for (int rightOfWindow = k; rightOfWindow < arr.length; rightOfWindow++) {
            sumOfWindow = sumOfWindow + arr[rightOfWindow] - arr[leftOfWindow];
            leftOfWindow++;
            max = Math.max(sumOfWindow, max);
        }
        return max;
    }
}
