package duke.command;

import duke.Storage;
import duke.Ui;
import duke.exception.DukeException;
import duke.task.Task;
import duke.task.TaskList;

public class AddCommand extends Command {

    Task t;

    public AddCommand(Task t) {
        this.t = t;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        tasks.addTask(t);

        System.out.println("Got it. I've added this task:");
        System.out.println(t);
        if (tasks.getSize() == 1) {
            System.out.println("Now you have 1 task in the list.");
        } else {
            System.out.println("Now you have " + tasks.getSize() + " tasks in the list.");
        }

        persistState(tasks, storage);
    }
}