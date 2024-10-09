public class Book {
  private String bookTitle;
  private String bookAuthor;
  private String bookIsbn;
  private double bookPrice;
  private int bookQuantity;

public Book(String bookTitle, String bookAuthor, String bookIsbn, double bookPrice, int bookQuantity) {
    this.bookTitle = bookTitle;
    this.bookAuthor = bookAuthor;
    this.bookIsbn = bookIsbn;
    this.bookPrice = bookPrice;
    this.bookQuantity = bookQuantity;
}

public String getBookTitle() {
    return bookTitle;
}

public void setBookTitle(String bookTitle) {
    this.bookTitle = bookTitle;
}

public String getBookAuthor() {
    return bookAuthor;
}

public void setBookAuthor(String bookAuthor) {
    this.bookAuthor = bookAuthor;
}

public String getBookIsbn() {
    return bookIsbn;
}

public void setBookIsbn(String bookIsbn) {
    this.bookIsbn = bookIsbn;
}

public double getBookPrice() {
    return bookPrice;
}

public void setBookPrice(double bookPrice) {
    this.bookPrice = bookPrice;
}

public int getBookQuantity() {
    return bookQuantity;
}

public void setBookQuantity(int bookQuantity) {
    this.bookQuantity = bookQuantity;
}
}
