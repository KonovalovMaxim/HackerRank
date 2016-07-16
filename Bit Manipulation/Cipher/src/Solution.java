import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String cipher = scanner.next();

        byte[] data = new byte[n];
        data[0] = Byte.parseByte(String.valueOf(cipher.charAt(0)));
        int diff = 0;
        int current = 0;
        for (int i = 0; i < n; i++) {
            if (i - diff == k) {
                current ^= data[diff++];
            }
            byte bit = Byte.parseByte(String.valueOf(cipher.charAt(i)));
            data[i] = (byte) (bit ^ current);
            System.out.print(data[i]);
            current ^= data[i];
        }
    }
}