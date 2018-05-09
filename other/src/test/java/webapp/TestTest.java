package webapp;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Creator: Pavlenko Bohdan
 * Date: 24.04.2018
 * Project: patterns
 */
public class TestTest {


    @Test
    public void equalSum1() {
        int[] data = {1, 2, 3, 4, -1};
        int[] expected = {2};
        assertArrayEquals(expected, TestWebapp.equalSum(data));
    }

    @Test
    public void equalSum2() {
        int[] data = {1, 2, 3, 4, 5};
        int[] expected = {};
        assertArrayEquals(expected, TestWebapp.equalSum(data));
    }

    @Test
    public void equalSum3() {
        int[] data = {1, 1, -1, -1, 3};
        int[] expected = {4, 2, 1};
        assertArrayEquals(expected, TestWebapp.equalSum(data));
    }

    @Test
    public void equalSum4() {
        int[] data = {1, 1, -1};
        int[] expected = {0};
        assertArrayEquals(expected, TestWebapp.equalSum(data));
    }
}