import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class QuitCommandTest {

  @Test
  public void shouldReturnQuitCommandName() {
      QuitCommand quitCommand = new QuitCommand();

      assertThat(quitCommand.name(), is("Quit"));
  }
}