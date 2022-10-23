package classstructureconstructors;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("Haruki Murakami", "Kafka on the shore");
        book.register("1122112");
        System.out.println(book.getTitle() + " by " + book.getAuthor() + " (" + book.getRegNumber() + ")");
    }
}
