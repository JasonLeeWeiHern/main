package commands;
import Storage.Storage;
import Tasks.Deadline;
import Tasks.Event;
import Tasks.Task;
import UI.Ui;
import java.io.IOException;
import Exception.DukeException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class SnoozeCommand extends Command {
    @Override
    public void execute(ArrayList<Task> list, Ui ui, Storage storage) throws DukeException, ParseException, IOException, NullPointerException {
        if(ui.FullCommand.length() == 6) {
            throw new DukeException("OOPS!!! The object of a rescheduling cannot be null.");
        }else{
            int index = Integer.parseInt(ui.FullCommand.substring(6).trim()) - 1;
            String Decription = list.get(index).description;
            System.out.println("You are rescheduling this task: "+Decription);
            System.out.println("Please type in your new timeline");
            ui.ReadCommand();
            String time  = ui.FullCommand;
            SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println("Are you sure you want to reschedule this task? (yes/no)");
            ui.ReadCommand();
            if(ui.FullCommand.equals("yes")) {
                if(list.get(index).listformat().contains("by")){
                    Deadline RescheduledDeadline = new Deadline(Decription, fmt.parse(time));
                    list.remove(index);
                    list.add(RescheduledDeadline);
                    System.out.println("Noted. I've changed this task's timeline: ");
                    System.out.println(RescheduledDeadline.listformat());
                }else{
                    Event RescheduledEvent = new Event(Decription,fmt.parse(time));
                    list.remove(index);
                    list.add(RescheduledEvent);
                    System.out.println("Noted. I've changed this task's timeline: ");
                    System.out.println(RescheduledEvent.listformat());
                }

                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getClass().getName().equals("Tasks.Deadline")) {
                        sb.append(list.get(i).toString() + "\n");
                    } else if (list.get(i).getClass().getName().equals("Tasks.Event")) {
                        sb.append(list.get(i).toString() + "\n");
                    } else {
                        sb.append(list.get(i).toString() + "\n");
                    }
                }
                storage.Storages(sb.toString());
            }else{
                System.out.println("It's fine. Nothing has been changed.");
            }
        }
    }
    @Override
    public boolean isExit() {
        return false;
    }
}