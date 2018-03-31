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
        int firstLargest, secondLargest;
        if (intsArray.length < 2) {
            return 0;
        }
        if (intsArray[0] > intsArray[1]) {
            secondLargest = intsArray[1];
            firstLargest = intsArray[0];
        } else {
            secondLargest = intsArray[1];
            firstLargest = intsArray[0];
        }
        for (int iterator = 1; iterator < intsArray.length; iterator++) {
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


    private static void cheackPair(int first, int second, int targetInt, List<Pair> list) {
        if ((first + second) == targetInt) {
            list.add(new Pair(first, second));
        }
    }

    /**
     * Find all pairs of numbers chosen from intsArray, such that each pair of numbers adds
     * up to targetInt.
     *
     * @param intsArray *            an array of integers
     * @param targetInt *            the targetInt integer
     * @return a List of Pairs of numbers that add up to a specified targetInt
     */
    public static List<Pair> findPairs(int[] intsArray, int targetInt) {
        ArrayList<Pair> retPairs = new ArrayList<Pair>();
        /*Arrays.stream(intsArray)
                .forEach(i1 -> Arrays.stream(intsArray)
                        .forEach(i2 -> cheackPair(i1, i2, targetInt, retPairs))
                );
        */
        for (int i = 0; i < intsArray.length; i++) {
            for (int i2 = i + 1; i2 < intsArray.length; i2++) {
                cheackPair(intsArray[i], intsArray[i2], targetInt, retPairs);
            }
        }
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

