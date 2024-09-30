package class1.ex;

public class MovieReviewMain {

    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];
        reviews[0] = new MovieReview();
        reviews[1] = new MovieReview();

        reviews[0].title = "인셉션";
        reviews[0].review = "인생은 무한 루프";
        reviews[1].title = "어바웃 타임";
        reviews[1].review = "인생 시간 영화!";

        for (MovieReview review : reviews) {
            System.out.println("영화 제목: " + review.title + ", 리뷰: " + review.review);
        }
    }
}
