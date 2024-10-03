package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] chunks = fruits.split(",");
        for (String chunk : chunks) {
            System.out.println(chunk);
        }
        System.out.println("joinedString = " + (String.join("->", chunks)));
    }
}
