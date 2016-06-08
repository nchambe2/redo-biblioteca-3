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
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Book> checkedInBooks = new ArrayList<>();
        List<Book> checkedOutBooks = new ArrayList<>();
        Book bookOne = new Book("Parable of the Sower", "Octavia Butler", "1993");
        Book bookTwo = new Book("Game of Thrones: A Story of Fire and Ice", "George R. R. Martin", "1996");
        checkedInBooks.add(bookOne);
        checkedInBooks.add(bookTwo);
        Library library = new Library(checkedInBooks, checkedOutBooks, printstream, bufferedReader);
        Map<String, Command> libraryCommands = new HashMap<>();
        Command quitCommand = new QuitCommand();
        Command listBookCommand = new ListBookCommand(library);
        Command checkOutBookCommand = new CheckoutBookCommand(library);
        libraryCommands.put("0", quitCommand);
        libraryCommands.put("1", listBookCommand);
        libraryCommands.put("2", checkOutBookCommand);
        Menu menu = new Menu(printstream, library, libraryCommands);
        Application application = new Application(printstream, menu, bufferedReader);
        application.start();
    }
}
