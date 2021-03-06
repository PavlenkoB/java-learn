package ua.ho.godex.sortWork;

import ua.ho.godex.sortWork.sortTypes.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Creator: Pavlenko Bohdan
 * Date: 31.03.2018
 * Project: patterns
 */
public class sortRunner {
    public static void main(String[] args) {
        List testList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            testList.add(new Double(Math.random() * 100).intValue());
        }
        System.out.println("testList" + testList);

        SortableTestList testArraySorter = new QuickSort();
        testList = testArraySorter.sort(testList);

        System.out.println("testList" + testList);
    }

}
