package ua.ho.godex.sortWork;

import ua.ho.godex.sortWork.sortTypes.BubbleSort;
import ua.ho.godex.sortWork.sortTypes.InsertionSort;
import ua.ho.godex.sortWork.sortTypes.SelectionSort;
import ua.ho.godex.sortWork.sortTypes.SortableTestList;

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

        SortableTestList testArraySorter = new SelectionSort();
        testList = testArraySorter.sort(testList);

        System.out.println("testList" + testList);
    }

}
