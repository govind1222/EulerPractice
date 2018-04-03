package problems;

public class Problem12 {

    public static void main(String[]args) {
        long start = System.nanoTime();
        int num = 500;
        int index = calculateIndex(num);
        int triangle = (index * (index + 1)) / 2;
        System.out.println(triangle);
        System.out.println(System.nanoTime() - start + " time passed");
    }

    private static int calculateIndex(int num) {
        int n = 1;
        int lnum = numDivisors(n), rnum = numDivisors(n+1);
        while (lnum * rnum < num) {
            n += 1;
            lnum = rnum;
            rnum = numDivisors(n + 1);
        }
        return n;
    }

    private static int numDivisors(int n) {
        if (n % 2 == 0)
            n = n/2;
        int divisors = 1;
        int count = 0;
        while (n % 2 == 0) {
            count += 1;
            n = n / 2;
        }
        divisors = divisors * (count + 1);
        int p = 3;
        while (n != 1) {
            count = 0;
            while (n % p == 0) {
                count += 1;
                n = n / p;
            }
            divisors = divisors * (count + 1);
            p += 2;
        }
        return divisors;
    }
}
