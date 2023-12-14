import java.util.Map;

public interface BookInterface {
    String addBook(Book book);
    String removeBook(String isbn);
    Book searchBook(String keyWoard);

    void displayBooks();
}
