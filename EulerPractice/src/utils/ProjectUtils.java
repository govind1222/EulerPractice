package utils;

import java.util.ArrayList;
import java.util.Collections;

public class ProjectUtils {

    public static ArrayList<Integer> calculatePrimeSet(long num) {
        final ArrayList<Integer> store = new ArrayList<>();
        while (num % 2 == 0) {
            store.add(2);
            num /= 2;
        }
        int oddDivisor = 3;
        while (num != 1) {
            while (num % oddDivisor == 0) {
                store.add(oddDivisor);
                num /= oddDivisor;
            }
            oddDivisor += 2;
        }
        Collections.sort(store);
        return store;
    }
}


