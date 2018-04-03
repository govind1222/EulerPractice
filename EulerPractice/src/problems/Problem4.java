package problems;

import java.util.ArrayList;
import java.util.Collections;

public class Problem4 {

    /**
     *  A palindromic number reads the same both ways. The largest palindrome made from
     *  the product of two 2-digit numbers is 9009 = 91 × 99.
     *  Find the largest palindrome made from the product of two 3-digit numbers.
     */

    private static ArrayList<Integer> store = new ArrayList<>();

    public static void main(String[]args) {
        String product;
        String reverse;
        for(int i = 100; i <= 999; i++) {
            for(int r = 100; r <= 999; r++) {
                product = (i * r) + "";
                reverse = new StringBuilder(product).reverse().toString();
                if(product.equals(reverse))
                    store.add(i * r);
            }
        }
        Collections.sort(store);
        System.out.println(store.get(store.size() - 1));
    }
}
