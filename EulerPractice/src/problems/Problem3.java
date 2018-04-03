package problems;

import utils.ProjectUtils;

import java.util.ArrayList;

public class Problem3 {

    /**
     *  The prime factors of 13195 are 5, 7, 13 and 29.
     *  What is the largest prime factor of the number 600851475143 ?
     */

    public static void main(String[]args) {
        long max = 600851475143L;
        ArrayList<Integer> store = ProjectUtils.calculatePrimeSet(max);
        System.out.println(store.get(store.size() - 1));
    }

}
