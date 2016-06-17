import java.util.Scanner;
import java.util.stream.LongStream;

public class Solution {

    public static long solution(long[] a) {
        return LongStream.of(a).sum();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        long[] data = new long[a];
        for (int i = 0; i < a; i++) {
            data[i] = in.nextLong();
        }
        System.out.print(solution(data));
    }
}