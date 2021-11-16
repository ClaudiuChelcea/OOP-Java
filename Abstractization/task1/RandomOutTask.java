package Abstractization.task1;

import java.util.Random;

public class RandomOutTask implements Task {

    /* Fields */
    int my_num;

    /* Constructors */
    public RandomOutTask() {
        my_num = new Random().nextInt(5) + 1;
    }

    /* Methods */
    public void execute()  {
        System.out.println("Asta va fi nota mea la TS: " + my_num);
    }
}
