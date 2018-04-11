package ua.ho.godex.codoloty.test1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Creator: Pavlenko Bohdan
 * Date: 10.04.2018
 * Project: patterns
 */
public class SolutionTest {
    private Solution solutionClass = new Solution();

    @Test
    public void solution1() {
        int[] testArr = {1, 3, 6, 4, 1, 2};
        assertEquals(5, solutionClass.solution(testArr));
    }

    @Test
    public void solution2() {
        int[] testArr = {1, 2, 3};
        assertEquals(4, solutionClass.solution(testArr));
    }

    @Test
    public void solution3() {
        int[] testArr = {-1, -3};
        assertEquals(1, solutionClass.solution(testArr));
    }

}