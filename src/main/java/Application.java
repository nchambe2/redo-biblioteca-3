import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Application {
    private PrintStream printStream;
    private Menu menu;
    private BufferedReader bufferedReader;

    public Application(PrintStream printStream, Menu menu, BufferedReader bufferedReader) {

        this.printStream = printStream;
        this.menu = menu;
        this.bufferedReader = bufferedReader;
    }

    public void start() {
        displayWelcomeMessage();
        menu.display();
        String userOption = getUserInput();
        menu.execute(userOption);
    }

    private void displayWelcomeMessage() {
        printStream.println("Welcome to Biblioteca");
    }

    private String getUserInput() {
        try {
            return bufferedReader.readLine();
        } catch(IOException e) {
            e.printStackTrace();
        }
        return null;
     }

}
