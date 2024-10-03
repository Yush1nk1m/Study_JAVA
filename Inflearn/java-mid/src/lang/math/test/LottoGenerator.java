package lang.math.test;

import java.util.Random;

public class LottoGenerator {

    public static void main(String[] args) {
        Random random = new Random();
        boolean[] visited = new boolean[46];
        Integer[] numbers = new Integer[6];
        int i = 0;
        while (i < 6) {
            Integer number = random.nextInt(45) + 1;
            if (!visited[number]) {
                visited[number] = true;
                numbers[i++] = number;
            }
        }

        System.out.print("로또 번호: ");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
