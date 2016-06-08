import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MenuTest {

    private Menu menu;
    private PrintStream printStream;
    private Library library;
    private Map<String, Command> libraryCommands;
    private Command listBookCommand;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        library = mock(Library.class);
        listBookCommand = mock(ListBookCommand.class);
        libraryCommands = new HashMap<>();
        libraryCommands.put("1", listBookCommand);
        menu = new Menu(printStream, library, libraryCommands);
    }

    @Test
    public void shouldDisplayListBookOptionWhenMenuIsDisplayed(){
        menu.display();

        verify(listBookCommand).name();
    }

    @Test
    public void shouldDisplayListBooksOptionWhenUserSelectsOptionOne(){
        menu.execute("1");

        verify(library).displayBookDetails();
    }

    @Test
    public void shouldDisplaySelectInvalidOptionWhenUserSelectsOptionTwo() {
        menu.execute("jdflajlf");

        verify(printStream).println("Select a valid option!");
    }


}