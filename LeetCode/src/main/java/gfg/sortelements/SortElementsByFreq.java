package main.java.gfg.sortelements;

import java.util.ArrayList;

public class SortElementsByFreq {
    public static void main(String[] args) {
        int[] array = {0, 0, 5, 7, 9, 5, 4, 2, 8, 4, 68, 5, 4, 1, 5, 8, 5, 4, 6, 2, 46, 2};
        ArrayList<Integer> solution = Solution.sortElementsByFreq(array);
        System.out.println(solution);
    }
}
