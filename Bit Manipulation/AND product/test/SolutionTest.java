import org.junit.Test;

import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void solution() throws Exception {
        String[] testCases = new String[]{"02", "03", "07"};
        for (String testCase : testCases) {
            File input = new File("resource//input" + testCase + ".txt");
            File output = new File("resource//output" + testCase + ".txt");
            Scanner inScanner = new Scanner(input);
            Scanner outScanner = new Scanner(output);
            int n = inScanner.nextInt();
            for (int i = 0; i < n; i++) {
                BigInteger L = new BigInteger(inScanner.next());
                BigInteger R = new BigInteger(inScanner.next());
                BigInteger expected = new BigInteger(outScanner.next());
                String result = Solution.solution(L, R);
                assertEquals(expected.toString(), result);
            }
        }
    }
}