import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void solution() throws Exception {
        assertEquals("19:05:45", Solution.solution("07:05:45PM"));
    }

    @Test
    public void solution2() throws Exception {
        assertEquals("12:45:54", Solution.solution("12:45:54PM"));
    }

    @Test
    public void solution3() throws Exception {
        assertEquals("00:05:45", Solution.solution("12:05:45AM"));
    }

    @Test
    public void solution4() throws Exception {
        assertEquals("16:59:59", Solution.solution("04:59:59PM"));
    }

    @Test
    public void solution5() throws Exception {
        assertEquals("00:01:01", Solution.solution("12:01:01AM"));
    }
}