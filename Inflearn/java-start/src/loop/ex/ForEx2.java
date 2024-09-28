package loop.ex;

public class ForEx2 {

    public static void main(String[] args) {
        for (int count = 0, num = 2; count < 10; num++) {
            if (num % 2 == 0) {
                System.out.println(num);
                count++;
            }
        }
    }
}
