import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int x = Integer.parseUnsignedInt(scanner.next());
            System.out.println(Integer.toUnsignedString(~x));
        }
    }
}
