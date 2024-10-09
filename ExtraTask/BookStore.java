import java.util.ArrayList;

public class BookStore {
    private List<Book> books;

    public BookStore(){
        books = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book with title " +book.bookTitle + " added");
    }
}
