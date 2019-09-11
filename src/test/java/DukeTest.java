import UI.Ui;
import org.junit.jupiter.api.Test;

<<<<<<< HEAD
import java.io.IOException;
<<<<<<< HEAD
import java.text.ParseException;
import java.util.ArrayList;
=======
<<<<<<< HEAD

import java.io.IOException;
=======
>>>>>>> Jason
import java.lang.reflect.Array;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
<<<<<<< HEAD
>>>>>>> f549e283c42c289d7c7324cee3f0e138922257cc
=======
>>>>>>> f7938ba1adc707a6bdf34ebdb286314c7a8a91d1
>>>>>>> Jason

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DukeTest {
    @Test
    public void testUi() {
        Ui ui = new Ui();
        assertEquals(" ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n", ui.showWelcome());
    }
    @Test
   public void test() {
        DeadlineCommand deadlineCommand = new DeadlineCommand();
        ArrayList<Task> tasks = new ArrayList<Task>();
        Ui ui = new Ui();
        Storage storage = new Storage();
        try {
            deadlineCommand.execute(tasks,ui,storage);
        } catch(IOException e) {
            assertEquals("An IOException was caught :" +e.getStackTrace()+"The system cannot find the path specified", e.getMessage());
        } catch (ParseException e) {
            assertEquals("Date Time has to be in YYYY-MM-DD HH:mm:ss format",e.getMessage());
        } catch (DukeException e) {
            assertEquals(e.getMessage(),e.getMessage());
        } catch (NullPointerException e){
            assertEquals(e.getMessage(),e.getMessage());
        }
    }
}