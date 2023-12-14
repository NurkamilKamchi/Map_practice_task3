import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();
        Library library = new Library();
//        BookImpl bookimpl = new BookImpl(library);
        BookImpl bookimpl = new BookImpl();
        System.out.println("Welcome!");
        while (true) {
            System.out.println("""
                    1.Add book.
                    2.Remove book.
                    3.Search book.
                    4.Display book.
                    5.Exit.
                    """);
            switch (scanner.nextLine()) {
                case "1" -> {
                    System.out.println(bookimpl.addBook(book));
                }
                case "2" -> {
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.println(bookimpl.removeBook(isbn));
                }
                case "3" -> {
                    System.out.print("Enter key word: ");
                    String key = scanner.nextLine();
                    Book book1 = bookimpl.searchBook(key);
                    if (book1 == null) {
                        System.out.println("Uncorrect info!!");
                    } else {
                        System.out.println(book1);
                    }
                }
                case "4" -> {
                    bookimpl.displayBooks();
                }case "5"->{
                System.exit(0);
                }
            }
        }
    }
}

//Classes:
//Book(ISBN, title, author)
//Library(Map<String, Book> books;)
////подсказка: Map для хранения книг, где ключ - ISBN, значение - объект Book
//methods:
//addBook(Book book), removeBook(String ISBN),
//searchBook(String keyWord), displayBooks();