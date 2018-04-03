package problems;

import utils.ProjectUtils;

import java.util.ArrayList;

public class Problem10 {

    public static void main(String[]args) {
        int sum = 0;
        ArrayList<Integer> store = ProjectUtils.calculatePrimeSet(2000000);
        for(int i : store)
            sum += i;
        System.out.println(sum);
    }

    private static boolean isPrime(int num) {
        for(int i = 2; i < num; i++) {
            if(num  % i == 0)
                return false;
        }
        return true;
    }
}
