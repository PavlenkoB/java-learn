package ua.ho.godex.sortWork.sortTypes;

import java.util.List;

/**
 * Creator: Pavlenko Bohdan
 * Date: 02.04.2018
 * Project: patterns
 */
public class QuickSort implements SortableTestList<List<Integer>> {
    private void quickSort(List<Integer> list, int first, int last) {
        this.showList(list);
        int i = first, j = last, x = list.get((first + last) / 2);
        Integer tmpInteger;
        do {
            while (list.get(i) < x) i++;
            while (list.get(j) > x) j--;

            if (i <= j) {
                if (i < j) {
                    tmpInteger = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, tmpInteger);
                }
                i++;
                j--;
            }
        } while (i <= j);
        if (i < last)
            quickSort(list, i, last);
        if (first < j)
            quickSort(list, first, j);
    }

    @Override
    public List<Integer> sort(List<Integer> list) {
        quickSort(list, 0, list.size() - 1);
        return list;
    }
}
