package main.java.gfg.sortelements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
    public static ArrayList<Integer> sortElementsByFreq(int[] array) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int numberOfArray : array) {
            freqMap.put(numberOfArray, freqMap.getOrDefault(numberOfArray, 0) + 1);
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int numberOfArray : array) {
            arrayList.add(numberOfArray);
        }
        arrayList.sort((a, b) -> {
            int freqA = freqMap.get(a);
            int freqB = freqMap.get(b);
            if (freqA != freqB) return freqB - freqA;
            else return a - b;
        });
        return arrayList;
    }
}
