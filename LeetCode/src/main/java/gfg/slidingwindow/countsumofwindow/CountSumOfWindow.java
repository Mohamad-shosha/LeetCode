package main.java.gfg.slidingwindow.countsumofwindow;

public class CountSumOfWindow {
    public static void main(String[] args) {
        int[] array = {1,2,1,3,4,2,3};
        int k = 4;
        System.out.println(Solution.countDistinct(array, k));
    }
}
