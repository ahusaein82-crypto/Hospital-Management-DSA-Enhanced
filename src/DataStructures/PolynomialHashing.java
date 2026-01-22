package DataStructures;

public class PolynomialHashing {
    private static final int P = 31;
    private static final int M = 1_000_000_009;

    public static long computeHash(String s) {
        long hashValue = 0;
        long pPow = 1;
        for (char c : s.toCharArray()) {
            hashValue = (hashValue + (c - 'a' + 1) * pPow) % M;
            pPow = (pPow * P) % M;
        }
        return hashValue;
    }
}
