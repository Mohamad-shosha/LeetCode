package main.java.leetcode;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] nums = new int [] {0,1,1,1,2,5,6,4,54,6,4,5,5,5,5,6,7};
        System.out.println(removeDuplicates(nums));
    }
        public static int removeDuplicates(int[] nums) {
            if (nums.length == 0) return 0;

            int k = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    k++;
                }
            }
            return k;
        }
    }

