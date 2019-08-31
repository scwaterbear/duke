package duke.task;

/**
 * Task class represents an act a user wants to perform.
 *
 * @author scwaterbear
 */
public class Task {
    protected boolean isDone;
    protected String description;

    /**
     * Class constructor.
     *
     * @param description description of task.
     */
    Task(String description) {
        this.isDone = false;
        this.description = description;
    }

    /**
     * Class constructor that must set task status when instantiated.
     *
     * @param description description of task.
     * @param isDone set status of task.
     */
    Task(String description, boolean isDone) {
        this.isDone = isDone;
        this.description = description;
    }

    protected String getStatusIcon() {
        return (isDone ? "\u2713" : "\u2718"); //return tick or X symbols
    }

    protected void markAsDone() {
        isDone = true;
    }

    /**
     * Returns a string representation of the task status and description.
     *
     * @return String task status and description.
     */
    @Override
    public String toString() {
        return "[" + getStatusIcon() + "] " + description;
    }

    /**
     * Returns a string representation of the task status and description for data storage.
     *
     * @return String task status and description.
     */
    public String dataFormat() {
        int isDoneInt;
        if (isDone) {
            isDoneInt = 1;
        } else {
            isDoneInt = 0;
        }
        return " | " + isDoneInt + " | " + description;
    }
}