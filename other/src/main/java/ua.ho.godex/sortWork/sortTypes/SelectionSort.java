package ua.ho.godex.sortWork.sortTypes;

import java.util.List;

/**
 * Creator: Pavlenko Bohdan
 * Date: 02.04.2018
 * Project: patterns
 */
public class SelectionSort implements SortableTestList<List<Integer>> {
    @Override
    public List<Integer> sort(List<Integer> list) {
        int min_i;
        Integer tmpElement;
        for (int i = 0; i < list.size(); i++) {
            min_i = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(min_i)) {
                    min_i = j;
                }
            }
            tmpElement = list.get(i);
            list.set(i, list.get(min_i));
            list.set(min_i, tmpElement);
            this.showList(list);
        }
        return list;
    }
}
