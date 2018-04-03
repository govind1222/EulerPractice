package problems;

import utils.ProjectUtils;

import java.util.ArrayList;

public class Problem7 {
    /**
     *  By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
     *  What is the 10 001st prime number?
     */

    public static void main(String[]args) {
        final ArrayList<Integer> store = ProjectUtils.calculatePrimeSet(Integer.MAX_VALUE);
        System.out.println(store.get(10001));
    }

    private static int calculatePrime() {
        int count = 0;
        for(int i = 2; i <= Integer.MAX_VALUE; i++) {
            if(isPrime(i)) {
                count++;
                if(count == 10001) {
                    return i;
                }
            }
        }
        return 0;
    }

    private static boolean isPrime(long num) {
        for(int i = 2; i < num; i++) {
            if(num  % i == 0)
                return false;
        }
        return true;
    }
}
