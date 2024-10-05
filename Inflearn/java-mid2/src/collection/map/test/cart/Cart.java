package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> productMap = new HashMap<>();

    public void add(Product product, int quantity) {
        productMap.put(product, productMap.getOrDefault(product, 0) + quantity);
    }

    public void minus(Product product, int quantity) {
        productMap.put(product, productMap.getOrDefault(product, 0) - quantity);
        if (productMap.get(product) <= 0) {
            productMap.remove(product);
        }
    }

    public void printAll() {
        System.out.println("== 모든 상품 출력 ==");
        for (Product key : productMap.keySet()) {
            System.out.println("상품: " + key + ", 수량: " + productMap.get(key));
        }
    }
}
