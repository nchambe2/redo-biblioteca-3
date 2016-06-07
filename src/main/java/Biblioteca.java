import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        Menu menu = new Menu(printstream, library);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Application application = new Application(printstream, menu, bufferedReader);
        application.start();
    }
}
