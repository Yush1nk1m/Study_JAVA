package access.ex;

public class Item {
    private String name;
    private int price;
    private int amount;

    public Item(String name, int price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public void display() {
        System.out.println("상품명: " + name + ", 합계: " + (price * amount));
    }

    public int getSum() {
        return price * amount;
    }
}
