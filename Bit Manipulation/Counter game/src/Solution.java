import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(game(new BigInteger(in.next()).subtract(new BigInteger("1"))));
        }
    }
    /*
    ------------------- N is not power of 2 ----------------------
    N = 1101001100          Louise will reduce it by 1000000000
    N =  101001100          Richard will reduce it by 100000000
    N =    1001100          Louise will reduce it by    1000000
    N =       1100          Richard will reduce it by      1000

    ------------------- N(100) is power of 2 ----------------------
    N =        100          Louise will reduce counter by half
    N =        10           Richard will reduce counter by half
    N =        1            Louise can't make a move, hence, loses
                            Richard is the winner !
     */
    static String game(BigInteger n) {
        return n.bitCount() % 2 == 0 ? "Richard" : "Louise";
    }
}