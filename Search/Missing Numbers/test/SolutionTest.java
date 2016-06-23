import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void solution() throws Exception {
        ArrayList<Integer> result = Solution.solution(
                new int[]{203, 204, 205, 206, 207, 208, 203, 204, 205, 206},
                new int[]{203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204}
        );
        assertArrayEquals(
                new int[]{204, 205, 206},
                result.stream().mapToInt(i -> i).toArray()
        );
    }
}