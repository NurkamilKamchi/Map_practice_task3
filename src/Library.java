import java.util.HashMap;
import java.util.Map;

public class Library {
    public static Map<String,Book> books = new HashMap<>();

    public Library() {
    }

    public Library(Map<String, Book> books) {
       this.books = books;
    }


    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
