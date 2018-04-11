package ua.ho.godex.codoloty.test2;

import java.util.Arrays;

/**
 * Creator: Pavlenko Bohdan
 * Date: 10.04.2018
 * Project: patterns
 */
public class Solution {
    public int[] solution(int length) {
        int position = 0;
        int[] generatedArray = generateArray(length);
        do {
            if (sumArr(generatedArray) != 0) {
                generatedArray = updateElement(generatedArray, position);
                position++;
                if (position >= length) {
                    position = 0;
                }
            }
        } while (sumArr(generatedArray) != 0);
        System.out.printf(Arrays.toString(generatedArray));
        return generatedArray;
    }


    private int[] updateElement(int[] arr, int position) {
        int element = arr[position];
        if (sumArr(arr) > 0) {
            do {
                element--;
            } while (searchInArray(arr, element));
        } else {
            do {
                element--;
            } while (searchInArray(arr, element));
        }
        arr[position] = element;
        return arr;
    }

    private int[] generateArray(int length) {
        int[] ret = new int[length];
        for (int counter = 0; counter < ret.length; counter++) {
            ret[counter] = counter;
        }
        return ret;
    }

    private int sumArr(int[] testArr) {
        int ret = testArr[0];
        for (int counter = 1; counter < testArr.length; counter++) {
            ret += testArr[counter];
        }
        return ret;
    }

    private boolean searchInArray(int[] arr, int number) {
        for (int counter = 0; counter < arr.length; counter++) {
            if (arr[counter] == number) {
                return true;
            }
        }
        return false;
    }
}
