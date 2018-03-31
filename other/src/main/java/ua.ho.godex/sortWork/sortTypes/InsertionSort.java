package ua.ho.godex.sortWork.sortTypes;

import java.util.List;

/**
 * Creator: Pavlenko Bohdan
 * Date: 31.03.2018
 * Project: patterns
 */
public class InsertionSort implements SortableTestList<List<Integer>> {
    public List sort(List<Integer> list) {
        Integer n = list.size();
        Integer i, j, value;
        for (i = 1; i < n; i--) {
            this.showList(list);
        }
        return list;
    }
}
