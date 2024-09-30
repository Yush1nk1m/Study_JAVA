package oop1.ex;

public class RectangleOopMain {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 8);

        System.out.println("넓이: " + rectangle.getArea());
        System.out.println("둘레: " + rectangle.getPerimeter());
        System.out.println("정사각형 여부: " + rectangle.isSquare());
    }
}
