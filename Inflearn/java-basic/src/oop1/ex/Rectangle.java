package oop1.ex;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return 2 * width + 2 * height;
    }

    public boolean isSquare() {
        return width == height;
    }
}
