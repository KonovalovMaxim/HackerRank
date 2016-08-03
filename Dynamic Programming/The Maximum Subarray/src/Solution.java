import org.omg.CORBA.INTERNAL;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int len = scanner.nextInt();
            int[] data = new int[len];
            for (int j = 0; j < len; j++) {
                data[j] = scanner.nextInt();
            }
            System.out.println(solution(data));
        }
    }

    public static String solution(int[] data) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int cSum = 0;
        for (int i = 0; i < data.length; i++) {
            currentSum += data[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(currentSum, maxSum);
            if (data[i] > 0) {
                cSum += data[i];
            }
        }
        int maxElement = IntStream.of(data).max().getAsInt();
        if (cSum == 0) {
            cSum = maxElement;
        }
        if (maxSum == 0) {
            maxSum = maxElement;
        }
        return maxSum + " " + cSum;
    }
}