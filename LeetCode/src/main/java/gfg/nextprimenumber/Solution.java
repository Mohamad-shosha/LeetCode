package main.java.gfg.nextprimenumber;

public class Solution {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int nextPrime(int number) {
        int nextNumber = number + 1;
        while (!isPrime(nextNumber)) {
            nextNumber++;
        }
        return nextNumber;
    }

    public static void main(String[] args) {
        System.out.println(nextPrime(7));
    }
}
