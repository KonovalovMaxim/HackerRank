import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] children = new int[n];
        for (int i = 0; i < n; i++) {
            children[i] = scanner.nextInt();
        }
        int currentCandies = 1;
        int[] dp = new int[children.length];
        dp[0] = 1;
        for (int i = 0; i < n - 1; i++) {
            if (children[i + 1] > children[i]) {
                currentCandies++;
            } else {
                currentCandies = 1;
            }
            dp[i + 1] = currentCandies;
        }
        currentCandies = 1;
        dp[n - 1] = Math.max(dp[n - 1], 1);
        for (int i = n - 1; i > 0; i--) {
            if (children[i - 1] > children[i]) {
                currentCandies++;
            } else {
                currentCandies = 1;
            }
            dp[i - 1] = Math.max(dp[i - 1], currentCandies);
        }
        BigInteger sum = new BigInteger("0");
        for (int i = 0; i < dp.length; i++) {
            sum = sum.add(new BigInteger(String.valueOf(dp[i])));
        }
        System.out.println(sum.toString());
    }
}