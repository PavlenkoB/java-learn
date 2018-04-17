package ua.ho.godex.codewars.test2;

import java.util.List;

/**
 * Creator: Pavlenko Bohdan
 * Date: 10.04.2018
 * Project: patterns
 */
public class SmileFaces {
    public static int countSmileys(List<String> arr) {
        return (int) arr.stream()
                .filter(x -> x.matches("[:;][-~]?[)D]"))
                .count();
    }
}
