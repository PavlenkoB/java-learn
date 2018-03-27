package ua.ho.godex;

import java.util.ArrayList;
import java.util.List;

/**
 * Creator: Pavlenko Bohdan
 * Date: 27.03.2018
 * Project: patterns
 */
public class MyFunctions {

    /**
     * find the second largest integer in an array.
     *
     * @param intsArray an array of integers
     * @return the second largest number in intsArray or a default value of 0
     */
    public static int secondLargest(final int[] intsArray) {
        int secondLargest = 0;
        int firstLargest = 0;
        for (int iterator = 0; iterator < intsArray.length; iterator++) {
            if (intsArray[iterator] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = intsArray[iterator];
            }
        }
        return secondLargest;
    } // secondLargest

    /**
     * Find all pairs of numbers from pairs, such that each both numbers in the pair
     * are divisible by the divisor.
     *
     * @param pairs   an array of pairs of integers
     * @param divisor the divisor integer
     * @return a List of Pairs of integers that are divisible by the divisor
     * parameter
     */
    public static List<Pair> divisible(Pair[] pairs, int divisor) {
        List<Pair> result = new ArrayList<>();
        for (Pair p : pairs) {
            if ((p.first % divisor == 0) && (p.second % divisor == 0)) {
                result.add(p);
            }
        }
        return result;
    } // divisible

    /**
     * Find all pairs of numbers chosen from intsArray, such that each pair of numbers adds
     * up to targetInt.
     *
     * @param intsArray *            an array of integers
     * @param targetInt *            the targetInt integer
     * @return a List of Pairs of numbers that add up to a specified targetInt
     */
    public List<Pair> findPairs(int[] intsArray, int targetInt) {
        ArrayList<Pair> retPairs = new ArrayList<Pair>();
        return retPairs;
    } // findPairs

    public static class Pair {
        public final int first;
        public final int second;

        public Pair(int first, int second) {
            super();
            this.first = first;
            this.second = second;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + first;
            result = prime * result + second;
            return result;
        } // hashCode

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Pair other = (Pair) obj;
            if (first != other.first)
                return false;
            if (second != other.second)
                return false;
            return true;
        } // equals
    }
}

