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

    default public void compare(C preList, C nowList) {
        for (int i = 0; i < preList.size(); i++) {
            Object preElement = preList.get(i);
            Object nowElement = nowList.get(i);
            if (!preElement.equals(nowElement)) {
                System.out.println(preElement + "<=" + i + "=>" + nowElement);
            }
        }
    }
}
