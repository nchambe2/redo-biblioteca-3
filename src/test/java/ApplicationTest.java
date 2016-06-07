import com.sun.javaws.jnl.LibraryDesc;
import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class ApplicationTest {

    private Application application;
    private Library library;
    private PrintStream printStream;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        library = mock(Library.class);
        application = new Application(printStream,library);
    }

    @Test
    public void shouldDisplayWelcomeMessageWhenApplicationStarts() {

        application.start();
        verify(printStream).println("Welcome to Biblioteca");
    }

    @Test
    public void shouldListAllBooksInTheLibraryWhenWelcomeMessageHasBeenDisplayed() {
        application.start();

        verify(library).list();
    }


}
