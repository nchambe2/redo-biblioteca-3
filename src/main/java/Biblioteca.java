import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca {
    public static void main(String[] args) {
        PrintStream printstream = new PrintStream(System.out);
        List<Book> bookList = new ArrayList<>();
        Book book = new Book("Parable of the Sower", "Octavia Butler", "1993");
        bookList.add(book);
        Library library = new Library(bookList, printstream);
        Map<String, Command> libraryCommands = new HashMap<>();
        Command listBookCommand = new ListBookCommand();
        libraryCommands.put("1", listBookCommand);
        Menu menu = new Menu(printstream, library, libraryCommands);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Application application = new Application(printstream, menu, bufferedReader);
        application.start();
    }
}
