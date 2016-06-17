import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for (int a_i = 0; a_i < n; a_i++) {
            for (int a_j = 0; a_j < n; a_j++) {
                a[a_i][a_j] = in.nextInt();
            }
        }
        System.out.println(solution(a));
    }

    public static int solution(int[][] A) {
        int diagonal = 0;
        for (int i = 0; i < A.length; i++) {
            diagonal += A[i][i];
        }
        int antiDiagonal = 0;
        for (int i = 0; i < A.length; i++) {
            antiDiagonal += A[i][A.length - 1 - i];
        }
        return Math.abs(diagonal - antiDiagonal);
    }
}
