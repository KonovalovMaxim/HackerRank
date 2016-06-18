import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {
    @Test
    public void solution4() throws Exception {
        String input = readFile("resource//input05.txt");
        Scanner in = new Scanner(input);
        int t = in.nextInt();
        ArrayList<String> answers = getAnswers();
        for (int a0 = 0; a0 < t; a0++) {
            int R = in.nextInt();
            int C = in.nextInt();
            String G[] = new String[R];
            for (int G_i = 0; G_i < R; G_i++) {
                G[G_i] = in.next();
            }

            int r = in.nextInt();
            int c = in.nextInt();
            String P[] = new String[r];
            for (int P_i = 0; P_i < r; P_i++) {
                P[P_i] = in.next();
            }
            assertEquals(answers.get(a0), Solution.solution(G, P));
        }
    }

    private ArrayList<String> getAnswers() throws Exception {
        String input = readFile("resource//output05.txt");
        ArrayList<String> result = new ArrayList<>();
        Scanner scanner = new Scanner(input);
        while (scanner.hasNext()) {
            result.add(scanner.next());
        }
        return result;
    }

    private String readFile(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            return sb.toString();
        } finally {
            br.close();
        }
    }

}