package collection.compare.test;

import java.util.*;

public class CardGameMain {

    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>(52);
        for (int i = 1; i <= 13; i++) {
            cards.add(new Card(Suit.SPADE, i));
            cards.add(new Card(Suit.HEART, i));
            cards.add(new Card(Suit.DIAMOND, i));
            cards.add(new Card(Suit.CLUB, i));
        }

        Collections.shuffle(cards);

        List<Card> player1 = cards.subList(0, 5);
        List<Card> player2 = cards.subList(5, 10);

        int score1 = 0;
        int score2 = 0;

        player1.sort(null);
        player2.sort(null);

        for (int i = 0; i < 5; i++) {
            score1 += player1.get(i).getNumber();
            score2 += player2.get(i).getNumber();
        }

        System.out.println("플레이어 1의 카드: " + player1 + ", 합계: " + score1);
        System.out.println("플레이어 2의 카드: " + player2 + ", 합계: " + score2);

        if (score1 > score2) {
            System.out.println("플레이어 1 승리");
        } else if (score1 < score2) {
            System.out.println("플에이어 2 승리");
        } else {
            System.out.println("무승부");
        }
    }

    public static class Card implements Comparable<Card> {

        private Suit suit;
        private Integer number;

        public Card(Suit suit, Integer number) {
            this.suit = suit;
            this.number = number;
        }

        public Suit getSuit() {
            return suit;
        }

        public Integer getNumber() {
            return number;
        }

        @Override
        public int compareTo(Card o) {
            if (this.number == o.number) {
                return this.suit.compareTo(o.suit);
            } else {
                return Integer.compare(this.number, o.number);
            }
        }

        @Override
        public String toString() {
            return number + "(" + suit.getIcon() + ")";
        }
    }
}
