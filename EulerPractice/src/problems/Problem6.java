package problems;

public class Problem6 {
    /*
        The sum of the squares of the first ten natural numbers is,
                        12 + 22 + ... + 102 = 385
        The square of the sum of the first ten natural numbers is,

                        (1 + 2 + ... + 10)2 = 552 = 3025
        Hence the difference between the sum of the squares of the first ten natural numbers
        and the square of the sum is 3025 − 385 = 2640.

        Find the difference between the sum of the squares of the first one hundred natural numbers
        and the square of the sum.
     */

    public static void main(String[]args) {
        System.out.println(calculateSquareOfSums(100) - calculateSumOfSquares(100));
    }

    private static int calculateSumOfSquares(int max) {
        int count = 0;
        for(int i = 1; i <= max; i++) {
            count += (int) Math.pow(i, 2);
        }
        return count;
    }

    private static int calculateSquareOfSums(int max) {
        int count = 0;
        for(int i = 1; i <= max; i++) {
            count += i;
        }
        return (int) Math.pow(count, 2);
    }
}
