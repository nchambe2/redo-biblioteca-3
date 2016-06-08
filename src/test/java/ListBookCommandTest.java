import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ListBookCommandTest {
    @Test
    public void shouldReturnCommandName() {
        ListBookCommand listBookCommand = new ListBookCommand();
        assertThat(listBookCommand.name(), is("List Books"));
    }
}