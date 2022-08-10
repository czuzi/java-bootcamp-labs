package attributes.book;

public class BookMain {

	public static void main(String[] args) {

		Book book = new Book("1984");
		System.out.println(book.getTitle());
		book.setTitle("Szived helyen epul mar a halalcsillag");
		System.out.println(book.getTitle());
	}
}
