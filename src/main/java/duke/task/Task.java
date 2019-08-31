package duke.task;

public class Task {
    protected boolean isDone;
    protected String description;

    Task(String description) {
        this.isDone = false;
        this.description = description;
    }

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

    @Override
    public String toString() {
        return "[" + getStatusIcon() + "] " + description;
    }

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