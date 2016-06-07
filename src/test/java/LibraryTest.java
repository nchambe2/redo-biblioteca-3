import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class LibraryTest {

    private Library library;
    private PrintStream printstream;
    private List<Book> bookList;
    private Book book;

    @Before
    public void setUp() {
        printstream = mock(PrintStream.class);
        book = mock(Book.class);
        bookList = new ArrayList<>();
        bookList.add(book);
        library = new Library(bookList, printstream);
    }

    @Test
    public void shouldListBookDetailsWhenLibraryListIsDisplayed() {
        when(book.details()).thenReturn("Book Title | Author | Year Published");
        library.displayBookDetails();

        verify(printstream).println("Book Title | Author | Year Published");
    }
}