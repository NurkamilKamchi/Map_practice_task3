import java.util.Scanner;

public class BookImpl implements BookInterface{

//    private final Library library;

//    public BookImpl(Library library) {
//        this.library = library;
//    }

    @Override
    public String addBook(Book book) {
        Book book1 = new Book();
        System.out.print("Enter book isbn: ");
        String isbn = new Scanner(System.in).nextLine();
        book1.setIsbn(isbn);
        System.out.print("Enter book title: ");
        String title= new Scanner(System.in).nextLine();
        book1.setTitle(title);
        System.out.print("Enter book author: ");
        String author = new Scanner(System.in).nextLine();
        book1.setAuthor(author);
        Library.books.put(book1.getIsbn(), book1);
        return "Success!!!" ;
    }

    @Override
    public String removeBook(String isbn) {
        for (String s:Library.books.keySet()){
            if (isbn.equalsIgnoreCase(s)){
                Library.books.remove(s);
                return "Succes";
            }
        }
        return "Isbn is not found!!!";
    }

    @Override
    public Book searchBook(String keyWoard) {
        for (String s:Library.books.keySet()){
            if (keyWoard.equalsIgnoreCase(s)){
                return Library.books.get(s);
            }

        }
        return null;
    }

    @Override
    public void displayBooks() {
        System.out.println(Library.books);
    }
}
