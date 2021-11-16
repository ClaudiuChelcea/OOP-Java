package Abstractization.task1;

public class OutTask implements Task {

    /* Fields */
    String message;

    /* Constructors */
    public OutTask() {
        message = "";
    }

    public OutTask(String message) {
        this.message = message;
    }

    /* Methods */
    public void execute()  {
        System.out.println(message);
    }
}
