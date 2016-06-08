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
        Book bookOne = new Book("Parable of the Sower", "Octavia Butler", "1993");
        Book bookTwo = new Book("Game of Thrones: A Story of Fire and Ice", "George R. R. Martin", "1996");
        bookList.add(bookOne);
        bookList.add(bookTwo);
        Library library = new Library(bookList, printstream);
        Map<String, Command> libraryCommands = new HashMap<>();
        Command quitCommand = new QuitCommand();
        Command listBookCommand = new ListBookCommand(library);
        libraryCommands.put("0", quitCommand);
        libraryCommands.put("1", listBookCommand);
        Menu menu = new Menu(printstream, library, libraryCommands);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Application application = new Application(printstream, menu, bufferedReader);
        application.start();
    }
}
