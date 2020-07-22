package leetcode;

/**
 * Author Tian
 * Date   2020-07-22
 */
public class PrimeNumber {

    /**
     * @param st
     * @return the Nst prime number
     */
    public int getPrimeNumberByST(int st) {
        int count = 0;
        for (int i = 2; ; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && ++count == st) {
                return i;
            }
        }
    }

}