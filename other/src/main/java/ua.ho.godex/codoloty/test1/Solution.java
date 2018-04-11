package ua.ho.godex.codoloty.test1;

/**
 * Creator: Pavlenko Bohdan
 * Date: 10.04.2018
 * Project: patterns
 */
public class Solution {
    public int solution(int[] arr) {
        int ret = 1;
        // write your code in Java SE 8
        int arrLength = arr.length;
        int counter = arrLength;
        boolean found = false;
        do {
            if (searchInArray(ret, arr)) {
                ret++;
            } else {
                break;
            }
        } while (!found || ret < 1000);

        return ret;
    }

    private boolean searchInArray(int number, int[] arr) {
        boolean ret = false;
        for (int counter = 0; counter < arr.length; counter++) {
            if (arr[counter] == number) {
                ret = true;
                break;
            }
        }
        return ret;
    }
}
