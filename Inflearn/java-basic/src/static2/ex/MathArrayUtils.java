package static2.ex;

public class MathArrayUtils {
    public static int sum(int[] array) {
        int s = 0;
        for (int number : array) {
            s += number;
        }
        return s;
    }

    public static double average(int[] array) {
        return (double)sum(array) / array.length;
    }

    public static int min(int[] array) {
        int m = array[0];
        for (int number : array) {
            if (number < m) {
                m = number;
            }
        }
        return m;
    }

    public static int max(int[] array) {
        int m = array[0];
        for (int number : array) {
            if (number > m) {
                m = number;
            }
        }
        return m;
    }
}
