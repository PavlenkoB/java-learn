package ua.ho.godex.codewars.test5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PascalsTriangle {
    public static long[] generate(int level) {
        List<long[]> levels = new ArrayList<long[]>();
        for (Integer levelCounter = 1; levelCounter <= level; levelCounter++) {
            levels.add(generateLevel(levelCounter, (levelCounter > 1) ? levels.get(levelCounter - 2) : new long[]{}));
        }
        List<Long> collect = levels.stream()
                .flatMap(integerEntry -> Arrays.stream(integerEntry).boxed())
                .collect(Collectors.toList());
        long[] result = new long[collect.size()];
        for (int i = 0; i < collect.size(); i++) {
            result[i] = collect.get(i);
        }
        return result;
    }

    private static long[] generateLevel(int levelNumber, long[] preLevel) {
        if (levelNumber == 1) {
            return new long[]{1};
        } else if (levelNumber == 2) {
            return new long[]{1, 1};
        }
        long[] result = new long[levelNumber];
        for (int i = 0; i < levelNumber; i++) {
            if (i == 0 || i == levelNumber - 1) {
                result[i] = 1;
            } else {
                result[i] = preLevel[i - 1] + preLevel[i];
            }
        }
        return result;
    }
}
