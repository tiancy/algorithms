package algorithms;

public class GoldenRatio {

    /**
     * estimate the Golden Ratio with Fibonacci sequence
     * @param t is the estimation precision parameter
     * @return
     */
    public double getGoldenRatio(double t) {
        int a = 1;
        int b = 1;
        while (true) {
            int c = a + b;
            if (Math.abs((double)c/b - (double)b/a) < t) {
                return (double)b/a;
            }
            a = b;
            b = c;
        }
    }

}