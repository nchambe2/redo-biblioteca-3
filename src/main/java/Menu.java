import java.io.PrintStream;
import java.util.Map;

public class Menu {

    private PrintStream printStream;
    private Library library;
    private Map<String, Command> libraryCommands;

    public Menu(PrintStream printStream, Library library, Map<String, Command> libraryCommands) {

        this.printStream = printStream;
        this.library = library;
        this.libraryCommands = libraryCommands;
    }

    public void display() {
        for(String key : libraryCommands.keySet()) {
            printStream.println(key + ". " + libraryCommands.get(key).name() + "\n");
        }
    }


    public void execute(String userSelection) {
        if(userSelection.equals("1")) {
            library.displayBookDetails();
        } else {
            displayMessage("Select a valid option!");
        }
    }

    private void displayMessage(String message) {
        printStream.println(message);
    }

}
