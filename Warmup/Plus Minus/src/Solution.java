import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        double[] result = solution(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static double[] solution(int[] A) {
        int minus = 0;
        int plus = 0;
        int zeros = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                minus++;
            } else if (A[i] > 0) {
                plus++;
            } else {
                zeros++;
            }
        }
        double[] result = new double[3];
        result[0] = plus / (double) A.length;
        result[1] = minus / (double) A.length;
        result[2] = zeros / (double) A.length;
        return result;
    }
}
