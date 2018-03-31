package ua.ho.godex.sortWork.sortTypes;

import java.util.List;

/**
 * Creator: Pavlenko Bohdan
 * Date: 31.03.2018
 * Project: patterns
 */
public interface SortableTestList<C extends List> {
    C sort(C list);

    default public void showList(C list) {
        System.out.println(this.getClass().getSimpleName() + " = [" + list + "]");
    }
}
