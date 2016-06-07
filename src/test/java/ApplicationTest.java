import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.*;


public class ApplicationTest {

    private Application application;
    private Library library;
    private PrintStream printStream;
    private Menu menu;
    private BufferedReader bufferedReader;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        menu = mock(Menu.class);
        bufferedReader = mock(BufferedReader.class);
        application = new Application(printStream, menu, bufferedReader);
    }

    @Test
    public void shouldDisplayWelcomeMessageWhenApplicationStarts() {

        application.start();
        verify(printStream).println("Welcome to Biblioteca");
    }


    @Test
    public void shouldDisplayListBooksMenuOptionWhenWelcomeMessageHasBeenDisplayed() {
        application.start();

        verify(menu).display();
    }

    @Test
    public void shouldDisplayBooksInLibraryWhenUserSelectsListBooksOption() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1");
        application.start();

        verify(menu).execute("1");
    }


}
