import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void solution() throws Exception {
        assertEquals(5, new BearAndSteadyGene().solution("GAAATAAA"));
    }

    @Test
    public void solution2() throws Exception {
        assertEquals(0, new BearAndSteadyGene().solution("AACCGGTT"));
    }

    @Test
    public void solution3() throws Exception {
        assertEquals(1, new BearAndSteadyGene().solution("AACCGATT"));
    }

    @Test
    public void solution4() throws Exception {
        assertEquals(2, new BearAndSteadyGene().solution("AACCGAAT"));
    }

    @Test
    public void solution5() throws Exception {
        assertEquals(6, new BearAndSteadyGene().solution("AAAAAAAA"));
    }

    @Test
    public void solution6() throws Exception {
        System.out.println(12);
    }


}