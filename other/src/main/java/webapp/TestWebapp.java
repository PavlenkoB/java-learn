package webapp;

/**
 * Creator: Pavlenko Bohdan
 * Date: 24.04.2018
 * Project: patterns
 */
public class TestWebapp {
    public static int[] equalSum(int[] data) {
        int[] ret = {};
        int[] newArr;
        int sumL = 0, sumR = 0;
        for (int counter = 1; counter < data.length; counter++) {
            sumR += data[counter];
        }

        for (int counter = 0; counter < data.length; counter++) {
            if ((sumL == sumR)) {
                newArr = new int[ret.length + 1];
                System.arraycopy(ret, 0, newArr, 1, ret.length);
                newArr[0] = counter;
                ret = newArr;
            }
            sumL += data[counter];
            if (counter + 1 < data.length) {
                sumR -= data[counter + 1];
            }
        }
        return ret;
    }
}
