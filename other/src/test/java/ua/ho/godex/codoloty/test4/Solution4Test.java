package ua.ho.godex.codoloty.test4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Creator: Pavlenko Bohdan
 * Date: 10.04.2018
 * Project: patterns
 */
public class Solution4Test {

    private Solution4 test4 = new Solution4();

    @Test
    public void solution1() {
        int solution = test4.solution(new int[]{6, 1, 4, 6, 3, 2, 7, 4}, 3, 2);
        assertEquals(24, solution);
    }

    @Test
    public void solution2() {
        int solution = test4.solution(new int[]{6, 1, 4}, 3, 2);
        assertEquals(-1, solution);
    }

    @Test
    public void solution3() {
        int solution = test4.solution(new int[]{6, 1, 4, 5}, 3, 2);
        assertEquals(-1, solution);
    }

    @Test
    public void solution4() {
        int solution = test4.solution(new int[]{6, 1, 4, 5}, 2, 2);
        assertEquals(16, solution);
    }

}