package ua.ho.godex.codoloty.test4;

/**
 * Creator: Pavlenko Bohdan
 * Date: 10.04.2018
 * Project: patterns
 */
public class Solution4 {
    public int solution(int[] array, int aliceRange, int bobRange) {
        Range alicePositions, bobPositions;
        if (array.length < 2) {
            return -1;
        }
        if (array.length < (aliceRange + bobRange)) {
            return -1;
        }
        Range rangeTmp = new Range(0, array.length);
        if (aliceRange < bobRange) {
            alicePositions = findMaxInRange(array, aliceRange, rangeTmp);
            bobPositions = findSecondPositions(array, bobRange, alicePositions);
        } else {
            bobPositions = findMaxInRange(array, bobRange, rangeTmp);
            alicePositions = findSecondPositions(array, aliceRange, bobPositions);
        }


        return sumArrPart(array, bobPositions.getStart(), bobPositions.getEnd()) + sumArrPart(array, alicePositions.getStart(), alicePositions.getEnd());
    }

    private Range findSecondPositions(int[] arr, int range, Range previosRange) {
        Range firstPart = findMaxInRange(arr, range, new Range(0, previosRange.getStart()));
        Range seconPart = findMaxInRange(arr, range, new Range(previosRange.getEnd(), arr.length));
        if (sumArrPart(arr, firstPart.getStart(), firstPart.getEnd()) > sumArrPart(arr, seconPart.getStart(), seconPart.getEnd())) {
            return firstPart;
        } else {
            return seconPart;
        }
    }

    private Range findMaxInRange(int[] arr, int range, Range rangeObject) {
        int startRange = rangeObject.getStart();
        int oldSum = 0;
        int counter = 0;
        do {
            if (sumArrPart(arr, counter, range) > oldSum) {
                startRange = counter;
            }
            counter++;
        } while ((startRange + range) < rangeObject.getEnd());
        return new Range(startRange + 1, startRange + range);
    }

    private int sumArrPart(int[] testArr, int start, int lenght) {
        int ret = testArr[start];
        for (int counter = start; counter < testArr.length; counter++) {
            ret += testArr[counter];
            lenght--;
            if (lenght == 0) {
                break;
            }
        }
        return ret;
    }

    class Range {
        private int start;
        private int end;

        public Range(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }
    }
}
