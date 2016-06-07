import java.io.PrintStream;
import java.util.List;

public class Library {
    private List<Book> bookList;
    private PrintStream printstream;

    public Library(List<Book> bookList, PrintStream printstream) {

        this.bookList = bookList;
        this.printstream = printstream;
    }

    public void displayBookDetails() {
        printstream.println(list());
    }

    private String list() {
        String bookTitle = "";

        for (Book book : bookList) {
            bookTitle += book.details();
        }

        return bookTitle;
    }


}
