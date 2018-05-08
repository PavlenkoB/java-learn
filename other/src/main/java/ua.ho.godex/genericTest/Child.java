package ua.ho.godex.genericTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Creator: Pavlenko Bohdan
 * Date: 07.04.2018
 * Project: patterns
 */
public class Child extends Parent {
    public List<? super Parent> testArray = new ArrayList<Parent>();
    public Child() {
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.testArray.add(new Parent());
    }
}
