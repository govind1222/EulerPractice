package problems;

public class Problem5 {
    /**
     *  2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
     *  What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
     */

    public static void main(String[]args) {
        System.out.println(getSmallestNumber());
    }

    private static int getSmallestNumber() {
        for(int i = 20; i < Integer.MAX_VALUE; i++) {
            if(divisibleByAll(i))
                return i;
        }
        return 0;
    }

    private static boolean divisibleByAll(int num) {
        for(int i = 2; i <= 20; i++) {
            if(num % i != 0)
                return false;
        }
        return true;
    }

}
