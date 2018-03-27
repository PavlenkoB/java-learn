package ua.ho.godex;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Creator: Pavlenko Bohdan
 * Date: 27.03.2018
 * Project: patterns
 */
public class MyFunctionsTest {
    @Before
    public void prepare() {

    }

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
        assertEquals(0, largest);
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
        List<MyFunctions.Pair> divisible = MyFunctions.divisible(testPairsArray, 3);
        assertEquals(2, divisible.size());
    }
}