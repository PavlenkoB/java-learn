package ua.ho.godex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Creator: Pavlenko Bohdan
 * Date: 22.03.2018
 * Project: java-learn
 */
public class TestLinkedListVsArrayList {
    public static void main(String[] args) {
        ArrayList testArrayList = new ArrayList();
        LinkedList testLinkedList = new LinkedList();
//        testAddToList(testLinkedList);
        testAddToList(testArrayList);
    }

    public static void testAddToList(List list) {
        System.out.println();
        System.out.println(list.getClass().getSimpleName());
        Integer elementsCounter = 10000;
        Integer element = new Integer(1);
        long startTime = System.currentTimeMillis();
        do {
            list.add(list.size() / 2, element);
        } while (elementsCounter-- > 0);
        long endTime = System.currentTimeMillis();
        System.out.println("Time=" + (endTime - startTime));
    }
}
