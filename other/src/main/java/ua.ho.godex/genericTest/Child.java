package ua.ho.godex.genericTest;

import java.util.ArrayList;

/**
 * Creator: Pavlenko Bohdan
 * Date: 07.04.2018
 * Project: patterns
 */
public class Child extends Parent {
    public Child() {
        ArrayList<? extends Parent> testArray = new ArrayList<Child>();
    }
}
