package ContactCommandTest;

import gazeeebo.TriviaManager.TriviaManager;
import gazeeebo.UI.Ui;
import gazeeebo.commands.contact.AddContactCommand;
import gazeeebo.storage.Storage;
import gazeeebo.tasks.Task;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddContactCommandTest {
    private Ui ui = new Ui();
    private Storage storage = new Storage();
    private ArrayList<Task> list = new ArrayList<>();
    private Stack<String> commandStack = new Stack<>();
    private ArrayList<Task> deletedTask = new ArrayList<>();

    private ByteArrayOutputStream output = new ByteArrayOutputStream();
    private PrintStream mine = new PrintStream(output);
    private PrintStream original = System.out;


    @BeforeEach
    void setupStream() {
        System.setOut(mine);
    }

    @AfterEach
    void restoreStream() {
        System.out.flush();
        System.setOut(original);
    }

    @Test
    void testAddContactsCommand() throws IOException {
        HashMap<String, String> map = new HashMap<>();
        Map<String, String> contact = new TreeMap<String, String>(map);
        ByteArrayInputStream in = new ByteArrayInputStream("Test,9625 1822".getBytes());
        System.setIn(in);
        AddContactCommand test = new AddContactCommand(ui, contact);
        assertEquals("Input in this format: Name,Number\n"
                + "Successfully added: Test,9625 1822\n", output.toString());
    }
}