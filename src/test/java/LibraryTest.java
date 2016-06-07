import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LibraryTest {

    @Test
    public void shouldListBookTitlesWhenLibraryListIsDisplayed() {
        PrintStream printstream = mock(PrintStream.class);
        List<String> bookList = new ArrayList<>();
        bookList.add("Book Title");
        Library library = new Library(bookList, printstream);

        library.displayBookList();

        verify(printstream).println("Book Title");
    }
}