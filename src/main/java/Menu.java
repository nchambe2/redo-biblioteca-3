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
            printStream.println(key + ". " + libraryCommands.get(key).name());
        }
    }


    public void execute(String userSelection) {
            if(validUserSelection(userSelection)) {
                runLibraryCommand(userSelection);
            } else {
                printStream.println("Select a valid option!");
            }
    }

    private void runLibraryCommand(String userSelection) {
        libraryCommands.get(userSelection).run();
    }

    private boolean validUserSelection(String userSelection) {
        return libraryCommands.containsKey(userSelection);
    }


}
