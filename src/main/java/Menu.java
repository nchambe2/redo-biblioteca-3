import java.io.PrintStream;

public class Menu {

    private PrintStream printStream;
    private Library library;

    public Menu(PrintStream printStream, Library library) {

        this.printStream = printStream;
        this.library = library;
    }

    public void display() {
        printStream.println(listBooksOption());
    }

    private String listBooksOption() {
        return "List Books";
    }

    public void execute(String userSelection) {
        if(userSelection.equals("2")) {
            library.displayBookDetails();
        }
    }
}
