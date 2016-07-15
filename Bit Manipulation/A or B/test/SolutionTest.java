import org.junit.Test;

import java.io.File;
import java.math.BigInteger;
import java.util.Objects;
import java.util.Scanner;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void solution() throws Exception {
        String[] testCases = new String[]{"01", "03", "11", "16"};
        for (String testCase : testCases) {
            System.out.println(testCase);
            File input = new File("resource//input" + testCase + ".txt");
            File output = new File("resource//output" + testCase + ".txt");
            Scanner inScanner = new Scanner(input);
            Scanner outScanner = new Scanner(output);
            int n = inScanner.nextInt();
            for (int i = 0; i < n; i++) {
                int k = inScanner.nextInt();
                BigInteger a = new BigInteger(inScanner.next(), 16);
                BigInteger b = new BigInteger(inScanner.next(), 16);
                BigInteger c = new BigInteger(inScanner.next(), 16);
                String out = outScanner.next();
                BigInteger[] result = Solution.solution(k, a, b, c);
                if (Objects.equals(out, "-1")) {
                    assertEquals(0, result.length);
                } else {
                    BigInteger expectedA = new BigInteger(out, 16);
                    assertFalse(result.length == 0);
                    BigInteger expectedB = new BigInteger(outScanner.next(), 16);
                    assertTrue(result[0].or(result[1]).equals(c));
                    assertEquals(result[0], expectedA);
                    assertEquals(result[1], expectedB);
                }
            }
        }
    }
}