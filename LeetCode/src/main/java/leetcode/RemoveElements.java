package main.java.leetcode;

import java.util.Arrays;

public class RemoveElements {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 2, 3};
        int val = 3;
        System.out.println(Arrays.toString(removeElement(arr, val)));
    }

    public static int[] removeElement(int[] nums, int val) {
        return Arrays.stream(nums)
                .filter(element -> element != val)
                .toArray();
    }

    public static int countNumberOfArrayElements(int[] arr, int val) {
        removeElement(arr, val);
        return arr.length;
    }
}
