package method.ex;

public class MethodEx1 {

    public static void main(String[] args) {
        double avg1 = average(1, 2, 3);
        System.out.println("평균값: " + avg1);

        double avg2 = average(15, 25, 35);
        System.out.println("평균값: " + avg2);
    }

    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
}
