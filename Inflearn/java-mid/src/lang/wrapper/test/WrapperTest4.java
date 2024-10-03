package lang.wrapper.test;

public class WrapperTest4 {

    public static void main(String[] args) {
        String str = "100";

        Integer integer = Integer.valueOf(str);
        System.out.println("integer = " + integer);

        int intValue = integer;
        System.out.println("intValue = " + intValue);

        integer = intValue;
        System.out.println("integer = " + integer);
    }
}
