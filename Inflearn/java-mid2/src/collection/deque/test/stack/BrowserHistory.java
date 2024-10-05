package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    private Deque<String> history = new ArrayDeque<>();

    public void visitPage(String address) {
        System.out.println("방문: " + address);
        history.push(address);
    }

    public String goBack() {
        if (!history.isEmpty()) {
            history.pop();
            if (!history.isEmpty()) {
                System.out.println("뒤로 가기: " + history.peek());
                return history.peek();
            }
        }
        return "페이지 없음";
    }
}
