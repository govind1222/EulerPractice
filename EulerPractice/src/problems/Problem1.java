package problems;

public class Problem1 {

    /**
     *   If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
     *   Find the sum of all the multiples of 3 or 5 below 1000.
     */

    public static void main(String args[]) {
        int limit = 1000;
        System.out.println(calculateSum(limit));
    }

    private static int calculateSum(int limit) {
        int count = 1;
        int sum = 0;
        while(count < limit) {
            if(count % 3 == 0 || count % 5 == 0) {
                sum += count;
            }
            count++;
        }
        return sum;
    }

}
