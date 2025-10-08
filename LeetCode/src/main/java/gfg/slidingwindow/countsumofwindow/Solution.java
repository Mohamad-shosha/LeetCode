package main.java.gfg.slidingwindow.countsumofwindow;

import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> countDistinct(int arr[], int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int leftOfWindow = 0;
        int sumOfWindow = 0;
        int max = 0;

        for (int i = 0; i < k; i++) {
            sumOfWindow += arr[i];
        }
        list.add(sumOfWindow);
        for (int rightOfWindow = k ; rightOfWindow < arr.length; rightOfWindow++) {
            sumOfWindow = sumOfWindow + arr[rightOfWindow] - arr[leftOfWindow];
            leftOfWindow++;
            list.add(sumOfWindow);
        }
        return list;
    }
}
