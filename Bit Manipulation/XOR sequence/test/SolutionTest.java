import org.junit.Test;

import java.io.File;
import java.util.Scanner;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void solution() throws Exception {
        File inputFile = new File("resource//input19.txt");
        File outputFile = new File("resource//output19.txt");
        Scanner scanner = new Scanner(inputFile);
        Scanner outScanner = new Scanner(outputFile);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            assertEquals(outScanner.nextLong(), Solution.solution(scanner.nextLong(), scanner.nextLong()));
        }
    }

    @Test
    public void solution2() throws Exception {
        File inputFile = new File("resource//input00.txt");
        File outputFile = new File("resource//output00.txt");
        Scanner scanner = new Scanner(inputFile);
        Scanner outScanner = new Scanner(outputFile);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            long R = scanner.nextLong();
            long L = scanner.nextLong();
            Solution.solution(R, L);
            assertEquals(outScanner.nextLong(), Solution.solution(R, L));
        }
    }
}