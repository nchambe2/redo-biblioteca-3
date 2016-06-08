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
        String titleAuthorYearPublished = "";

        for (Book book : bookList) {
            titleAuthorYearPublished += book.details() + "\n";
        }

        return titleAuthorYearPublished;
    }


}
