import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void shouldCombineBookTitleAuthorAndYearWhenThereIsOneLibraryBook() {
        String title = "Title";
        String author = "Author";
        String yearPublished = "Year Published";
        Book book = new Book(title, author, yearPublished);

        assertThat(book.details(), is("Title | Author | Year Published"));
    }

}