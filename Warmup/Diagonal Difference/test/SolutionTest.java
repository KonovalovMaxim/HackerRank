import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void solution() throws Exception {
        int[][] data = new int[][]{
                {11, 2, 4},
                {4, 5, 6},
                {10, 8, -12}
        };
        assertEquals(15, Solution.solution(data));
    }
}