import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = new BigInteger(scanner.next());
        BigInteger b = new BigInteger(scanner.next());
        int n = scanner.nextInt();
        int counter = 2;
        if (n == 1) {
            System.out.println(a);
        } else if (n == 2) {
            System.out.println(b);
        } else {
            while (counter < n) {
                counter++;
                BigInteger c = b.multiply(b).add(a);
                a = b;
                b = c;
            }
            System.out.println(b.toString());
        }
    }
}