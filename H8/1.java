import java.util.ArrayList;
import java.util.Scanner;

/* 你的答案被嵌在这里 */
class BookList {
  private ArrayList<Book> books = new ArrayList<>();

  public void addBook(Book book) {
    books.add(book);
  }

  public void searchBook(Book book) {
    if (books.contains(book))
      System.out.println("found: " + books.indexOf(book));
    else
      System.out.println("not found");
  }
}

class Book {
  private String name, author;
  private int price, edition;

  public Book(String name, int price, String author, int edition) {
    this.name = name;
    this.price = price;
    this.author = author;
    this.edition = edition;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Book))
      return false;
    Book tmp = (Book) obj;
    return name.equalsIgnoreCase(tmp.name) && author.equalsIgnoreCase(tmp.author) && edition == tmp.edition;
  }

  @Override
  public String toString() {
    return "name:" + name + ", author:" + author + ", price:" + price + ", edition:" + edition;
  }
}

public class Main {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    BookList bl = new BookList();
    int n = s.nextInt();
    for (int i = 0; i < n; i++) {
      bl.addBook(new Book(s.next(),
          s.nextInt(),
          s.next(),
          s.nextInt()));
    }
    bl.searchBook(new Book(s.next(),
        0,
        s.next(), s.nextInt()));
  }
}
