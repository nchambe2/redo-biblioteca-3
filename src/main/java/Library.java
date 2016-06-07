import java.io.PrintStream;
import java.util.List;

public class Library {
    private List<String> bookList;
    private PrintStream printstream;

    public Library(List<String> bookList, PrintStream printstream) {

        this.bookList = bookList;
        this.printstream = printstream;
    }

    public void displayBookList() {
        printstream.println(list());
    }

    private String list() {
        String bookTitle = "";

        for (String book : bookList) {
            bookTitle += book;
        }

        return bookTitle;
    }

}
