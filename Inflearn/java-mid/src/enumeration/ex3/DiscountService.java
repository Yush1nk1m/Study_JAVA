package enumeration.ex3;

public class DiscountService {

    public int discount(Grade grade, int price) {
        int discountPercent = 0;

        switch (grade) {
            case Grade.BASIC:
                discountPercent = 10;
                break;
            case Grade.GOLD:
                discountPercent = 20;
                break;
            case Grade.DIAMOND:
                discountPercent = 30;
                break;
            default:
                System.out.println("할인 X");
        }

        return price * discountPercent / 100;
    }
}
