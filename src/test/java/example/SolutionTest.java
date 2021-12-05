package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void solutionTest() {
        int[] A = {1, 3, 6, 4, 1, 2};
        Solution s = new Solution();
        int solution = s.solution(A);
        assertEquals(5, solution);


    }

    @Test
    public void test2() {
        Solution s = new Solution();

        int[] B = {1, 2, 3};
        assertEquals(4, s.solution(B));
    }

    @Test
    public void t3() {
        int[] C = {-1, -3};
        Solution s = new Solution();
        assertEquals(1, s.solution(C));
    }

}
