package main.java.gfg.slidingwindow.maxsumsubarray;

public class MaxSumSubarray {
    public static void main(String[] args) {
        int[] array = {100, 200, 300, 400};
        int k = 2;
        int res = Solution.maxSubarraySum(array, k);
        System.out.println(res);
    }
}
