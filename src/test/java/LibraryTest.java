import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class LibraryTest {

    private Library library;
    private PrintStream printstream;
    private List<Book> checkedInBooks;
    private Book book;
    private List<Book> checkedOutBooks;
    private BufferedReader bufferedReader;

    @Before
    public void setUp() {
        bufferedReader = mock(BufferedReader.class);
        printstream = mock(PrintStream.class);
        book = mock(Book.class);
        checkedInBooks = new ArrayList<>();
        checkedInBooks.add(book);
        library = new Library(checkedInBooks, checkedOutBooks, printstream, bufferedReader);
    }

    @Test
    public void shouldListBookDetailsWhenLibraryListIsDisplayed() {
        when(book.details()).thenReturn("Book Title | Author | Year Published");
        library.displayBookDetails();

        verify(printstream).println("Book Title | Author | Year Published\n");
    }

    @Test
    public void shouldCheckoutBookWhenBookIsCheckedIn() throws IOException {
        when(book.details()).thenReturn("Book Title | Author | Year Published");
        when(bufferedReader.readLine()).thenReturn("Book Title");
        library.checkout();
        assertThat(checkedOutBooks.contains("Book Title"), is(true));
    }
}