package ua.ho.godex.sortWork.sortTypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Creator: Pavlenko Bohdan
 * Date: 31.03.2018
 * Project: patterns
 */
public class InsertionSort implements SortableTestList<List<Integer>> {
    public List sort(List<Integer> list) {
        Integer n = list.size();
        Integer i, j, value;
        for (i = 1; i < n; i++) {
            value = list.get(i);
            for (j = i - 1; j >= 0 && list.get(j) > value; j--) {
                list.set(j + 1, list.get(j));
//                this.showList(list);
            }
            list.set(j + 1, value);
            this.showList(list);
        }
        return list;
    }
}
