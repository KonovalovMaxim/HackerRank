import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int N = scanner.nextInt();
            int[] a = new int[N];
            for (int j = 0; j < N; j++) {
                a[j] = scanner.nextInt();
            }
            if (N % 2 == 0) {
                System.out.println(0);
            } else {
                System.out.println(findXor(a));
            }
        }
    }

    static int findXor(int[] a) {
        int xor = 0;
        for (int i = 0; i < a.length; i += 2) {
            xor ^= a[i];
        }
        return xor;
    }
}