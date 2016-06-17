import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            System.out.println(solution(n));
        }
    }

    public static StringBuilder solution(int n) {
        StringBuilder result = new StringBuilder();
        if (n % 3 == 0) {
            for (int i = 0; i < n; i++) {
                result.append("5");
            }
            return result;
        }
        int z = n;
        while (z % 3 != 0) {
            z -= 5;
            if (z < 0) {
                result.append("-1");
                return result;
            }
        }
        for (int i = 0; i < z; i++) {
            result.append("5");
        }
        for (int i = 0; i < n - z; i++) {
            result.append(3);
        }
        return result;
    }
}
