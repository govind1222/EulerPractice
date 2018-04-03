package problems;

public class Problem14 {

    public static void main(String[]args) throws ArithmeticException{
        int longestChain = Integer.MIN_VALUE;
        int startNum = 2;
        for (int i = 2; i < 1000000; i++) {
            int numInChain = collatzSeq(i);
            if(numInChain > longestChain){
                longestChain = numInChain;
                startNum = i;
            }
        }
        System.out.println(collatzSeq(910107));
        System.out.println(startNum);
    }

    private static int collatzSeq(int num) {
        int count = 1;
        while (num > 1) {
            count ++;
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
        }
        return count;
    }
}
