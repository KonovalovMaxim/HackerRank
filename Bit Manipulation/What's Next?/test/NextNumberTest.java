import org.junit.Test;

import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

import static org.junit.Assert.*;

public class NextNumberTest {
    @Test
    public void nextNumber() throws Exception {
        String[] testCases = new String[]{"01", "02", "03", "11", "13"};
        for (int k = 0; k < testCases.length; k++) {
            File input = new File("resource//input" + testCases[k] + ".txt");
            File output = new File("resource//output" + testCases[k] + ".txt");
            System.out.println(testCases[k]);
            Scanner inScanner = new Scanner(input);
            Scanner outScanner = new Scanner(output);
            int n = inScanner.nextInt();
            for (int i = 0; i < n; i++) {
                int len = inScanner.nextInt();
                BigInteger[] a = new BigInteger[len];
                for (int j = 0; j < len; j++) {
                    a[j] = new BigInteger(inScanner.next());
                }
                int len2 = outScanner.nextInt();
                BigInteger[] expected = new BigInteger[len2];
                for (int j = 0; j < len2; j++) {
                    expected[j] = new BigInteger(outScanner.next());
                }
                System.out.println(len2);
                BigInteger[] result = new NextNumber().nextNumber(a);
                for (int j = 0; j < result.length; j++) {
                    System.out.print(result[j] + " ");
                }
                System.out.println();
                for (int j = 0; j < expected.length; j++) {
                    System.out.print(expected[j] + " ");
                }
                System.out.println();
                assertArrayEquals(result, expected);
            }
        }
    }
}