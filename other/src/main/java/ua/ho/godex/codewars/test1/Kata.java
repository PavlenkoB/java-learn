package ua.ho.godex.codewars.test1;

/**
 * Creator: Pavlenko Bohdan
 * Date: 10.04.2018
 * Project: patterns
 */
public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder ret = new StringBuilder();
        ret.append("(");
        appendNumbers(numbers, 0, 2, ret);
        ret.append(") ");
        appendNumbers(numbers, 3, 5, ret);
        ret.append("-");
        appendNumbers(numbers, 6, 9, ret);
        // Your code here!
        return ret.toString();
    }

    private static StringBuilder appendNumbers(int[] numbers, int start, int end, StringBuilder stringBuilder) {
        for (int counter = start; counter <= end && counter < numbers.length; counter++) {
            stringBuilder.append(numbers[counter]);
        }
        return stringBuilder;
    }
}
