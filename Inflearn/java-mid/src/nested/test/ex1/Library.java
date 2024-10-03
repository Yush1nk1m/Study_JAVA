package nested.test.ex1;

public class Library {

    private int capacity;
    private int index = 0;
    private Book[] books;

    private class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public void print() {
            System.out.println("도서 제목: " + title + ", 저자: " + author);
        }
    }

    public Library(int capacity) {
        this.capacity = capacity;
        books = new Book[capacity];
    }

    public void addBook(String title, String author) {
        if (index == capacity) {
            System.out.println("도서관 저장 공간이 부족합니다.");
        } else {
            books[index++] = new Book(title, author);
        }
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < index; i++) {
            books[i].print();
        }
    }
}
