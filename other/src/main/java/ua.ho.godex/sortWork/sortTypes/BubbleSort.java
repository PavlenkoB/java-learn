package ua.ho.godex.sortWork.sortTypes;

import java.util.List;

/**
 * Creator: Pavlenko Bohdan
 * Date: 31.03.2018
 * Project: patterns
 */
public class BubbleSort implements SortableTestList<List<Integer>> {
    public List sort(List<Integer> list) {
        Integer n = list.size();
        Integer tmp;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    tmp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, tmp);
                }
            }
            this.showList(list);
        }
        return list;
    }
}
