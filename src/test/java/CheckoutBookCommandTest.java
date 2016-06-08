import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CheckoutBookCommandTest {

    private Command checkoutBookCommand;
    private Library library;

    @Before
    public void setUp() {
        library = mock(Library.class);
        checkoutBookCommand = new CheckoutBookCommand(library);
    }

    @Test
    public void shouldCheckoutBookWhenCommandIsRun() {
        checkoutBookCommand.run();

        verify(library).checkout();
    }

    @Test
    public void shouldReturnCommandName() {
        assertThat(checkoutBookCommand.name(), is("Checkout Book"));
    }
}