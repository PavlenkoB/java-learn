package ua.ho.godex;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Creator: Pavlenko Bohdan
 * Date: 27.03.2018
 * Project: patterns
 */
public class MyFunctionsTest {

    @Test
    public void secondLargest1() {
        int[] testArray = {1, 2, 3};
        int largest = MyFunctions.secondLargest(testArray);
        assertEquals(2, largest);
    }

    @Test
    public void secondLargest2() {
        int[] testArray = {-1, -2, -3};
        int largest = MyFunctions.secondLargest(testArray);
        assertEquals(-2, largest);
    }

    @Test
    public void secondLargest3() {
        int[] testArray = {-1};
        int largest = MyFunctions.secondLargest(testArray);
        assertEquals(0, largest);
    }

    @Test
    public void secondLargest4() {
        int[] testArray = {-1, -3};
        int largest = MyFunctions.secondLargest(testArray);
        assertEquals(-3, largest);
    }

    @Test
    public void secondLargest5() {
        int[] testArray = {-3, -1};
        int largest = MyFunctions.secondLargest(testArray);
        assertEquals(-3, largest);
    }

    @Test
    public void divisible1() {
        MyFunctions.Pair[] testPairsArray = {
                new MyFunctions.Pair(1, 2),
                new MyFunctions.Pair(3, 6),
                new MyFunctions.Pair(2, 6),
                new MyFunctions.Pair(6, 6),
                new MyFunctions.Pair(5, 10)
        };
        int divisor = 3;
        List<MyFunctions.Pair> divisible = MyFunctions.divisible(testPairsArray, divisor);
        assertEquals(2, divisible.size());
    }

    @Test
    public void findPairs1() {
        int[] testList = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<MyFunctions.Pair> pairList = MyFunctions.findPairs(testList, 5);
        assertEquals(2, pairList.size());
    }

    @Test
    public void findPairs2() {
        int[] testList = {1, 2, 3, 4, 5, 6, 7, 8, -1};
        List<MyFunctions.Pair> pairList = MyFunctions.findPairs(testList, 5);
        assertEquals(3, pairList.size());
    }

    @Test
    public void findPairs3() {
        int[] testList = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<MyFunctions.Pair> pairList = MyFunctions.findPairs(testList, 10);
        assertEquals(4, pairList.size());
    }
}