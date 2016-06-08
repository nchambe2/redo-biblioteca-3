import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ListBookCommandTest {

    private Command listBookCommand;
    private Library library;

    @Before
    public void setUp() {
        library = mock(Library.class);
        listBookCommand = new ListBookCommand(library);
    }

    @Test
    public void shouldListAllBookDetailsWhenTheRunCommandIsExecuted() {
        listBookCommand.run();
        verify(library).displayBookDetails();
    }

    @Test
    public void shouldReturnCommandName() {
        assertThat(listBookCommand.name(), is("List Books"));
    }
}