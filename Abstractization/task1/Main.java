package Abstractization.task1;

public class Main {
    public static void main(String[] args) {
        /* Test implementations */
        OutTask el_mesg = new OutTask("Am 5 teme, nu am facut niciuna! :(");
        el_mesg.execute();

        RandomOutTask el_random = new RandomOutTask();
        el_random.execute();

        CounterOutTask el_counter = new CounterOutTask();
        for (int i = 0; i < 10; ++i)
            el_counter.execute();



    }
}
