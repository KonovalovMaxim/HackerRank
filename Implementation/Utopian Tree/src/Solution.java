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

    public static int solution(int years) {
        int tree = 1;
        for (int i = 0; i < years; i++) {
            if (i % 2 == 0) {
                tree *= 2;
            } else {
                tree++;
            }
        }
        return tree;
    }
}
