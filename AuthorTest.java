import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Book {
	
	String title;
	
	Book(String title) {
		this.title = title;
	}
}
class Author {
	
	String name;
	List<Book> books;
	Author(String name,List<Book> books) {
		this.name = name;
		this.books = books;
	}
}
public class AuthorTest {

	public static void main(String[] args) {
		List<Author> auths = Arrays.asList(new Author("auth1", Arrays.asList(new Book("title1"), new Book("title11"))),
				new Author("auth2", Arrays.asList(new Book("title2"), new Book("title22"))),
				new Author("auth3", Arrays.asList(new Book("title3"), new Book("title33"))));
		
		List<Author> authResult = auths.stream()
				.filter(auth -> (auth.books.stream().anyMatch(book -> book.title.contains("title"))))
				.collect(Collectors.toList());
		authResult.stream().forEach(auth -> {
			System.out.println(auth.name);
		});

	}

}
