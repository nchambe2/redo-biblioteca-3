import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    public static void main(String[] args) {
        PrintStream printstream = new PrintStream(System.out);
        List<String> bookList = new ArrayList<>();
        bookList.add("Parable of the Sower");
        Library library = new Library(bookList, printstream);
        Application application = new Application(printstream, library);
        application.start();
    }
}
