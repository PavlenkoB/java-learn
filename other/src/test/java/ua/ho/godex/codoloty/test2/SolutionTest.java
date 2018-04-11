package ua.ho.godex.codoloty.test2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Creator: Pavlenko Bohdan
 * Date: 10.04.2018
 * Project: patterns
 */
public class SolutionTest {
    private Solution test2 = new Solution();

    @Test
    public void solution() {
        int[] solution = test2.solution(20);
        int[] right = {1, 0, -3, 2};
        assertArrayEquals(right, solution);
    }
}