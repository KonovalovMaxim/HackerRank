import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for (int a0 = 0; a0 < Q; a0++) {
            long L = in.nextLong();
            long R = in.nextLong();
            System.out.println(solution(L, R));
        }
    }

    static long solution(long L, long R) {
        return get(L-1) ^ get(R);
    }

    static long get(long x) {
        int a = (int) (x % 8);
        if (a == 0 || a == 1) {
            return x;
        }
        if (a == 2 || a == 3) {
            return 2;
        }

        if (a == 4 || a == 5) {
            return x + 2;
        }
        return 0;
    }
}
