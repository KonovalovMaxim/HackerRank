import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int R = in.nextInt();
            String G[] = new String[R];
            for (int G_i = 0; G_i < R; G_i++) {
                G[G_i] = in.next();
            }

            int r = in.nextInt();
            String P[] = new String[r];
            for (int P_i = 0; P_i < r; P_i++) {
                P[P_i] = in.next();
            }
            System.out.println(solution(G, P));
        }
    }

    public static String solution(String[] T, String[] P) {
        for (int i = 0; i < T.length - P.length + 1; i++) {
            for (int j = 0; j < T[i].length(); j++) {
                if (check(i, j, T, P)) {
                    return "YES";
                }
            }
        }
        return "NO";
    }

    public static boolean check(int n, int m, String[] T, String[] P) {
        for (int i = 0; i < P.length; i++) {
            for (int j = 0; j < P[i].length(); j++) {
                if (i + n >= T.length || j + m >= T[i].length()) {
                    return false;
                }
                if (T[i + n].charAt(j + m) != P[i].charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}