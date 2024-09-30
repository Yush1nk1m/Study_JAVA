package access.ex;

public class ShoppingCart {
    private Item[] items;
    private int count = 0;
    private int totalPrice = 0;

    public ShoppingCart() {
        items = new Item[10];
    }

    public void addItem(Item item) {
        if (count < items.length) {
            items[count++] = item;
            totalPrice += item.getSum();
        } else {
            System.out.println("장바구니가 가득 찼습니다.");
        }
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < count; i++) {
            items[i].display();
        }
        System.out.println("전체 가격 합: " + totalPrice);
    }
}
