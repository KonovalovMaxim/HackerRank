import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(solution(a, b));
        }
    }

    public static int solution(int a, int b) {
        int counter = 0;
        int sqrt = (int) Math.sqrt(a);
        int square = sqrt * sqrt;
        while (square <= b) {
            square = sqrt * sqrt;
            sqrt++;
            if (square >= a && square <= b) {
                counter++;
            }
            System.out.println(square);
        }
        return counter;
    }
}
