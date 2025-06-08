package main.java.gfg.commonelements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
    public static ArrayList<Integer> commonElements(int[] a, int[] b) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : b) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 4, 8, 9, 1};
        System.out.println(commonElements(a, b));
    }
}
