import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    public static void main(String[] args) {
        PrintStream printstream = new PrintStream(System.out);
        List<Book> bookList = new ArrayList<>();
        Book book = new Book("Parable of the Sower", "Octavia Butler", "1993");
        bookList.add(book);
        Library library = new Library(bookList, printstream);
        Application application = new Application(printstream, library);
        application.start();
    }
}
