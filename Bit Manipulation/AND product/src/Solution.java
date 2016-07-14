import java.math.BigInteger;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(solution(new BigInteger(scanner.next()), new BigInteger(scanner.next())));
        }
    }

    static String solution(BigInteger L, BigInteger R) {
        if (L.equals(new BigInteger("0")) || R.equals(new BigInteger("0"))) {
            return "0";
        }
        BigInteger diff = R.subtract(L);
        int diffLength = diff.toString(2).length();
        String rBinary = R.toString(2);
        String lBinary = L.toString(2);
        String rHead = rBinary.substring(0, rBinary.length() - diffLength);
        String lHead = lBinary.substring(0, lBinary.length() - diffLength);
        BigInteger head = new BigInteger(rHead, 2).and(new BigInteger(lHead, 2));
        StringBuilder sb = new StringBuilder();
        sb.append(head.toString(2));
        char[] tale = new char[diffLength];
        Arrays.fill(tale, '0');
        sb.append(tale);
        BigInteger result = new BigInteger(sb.toString(), 2);
        return result.toString();
    }
}