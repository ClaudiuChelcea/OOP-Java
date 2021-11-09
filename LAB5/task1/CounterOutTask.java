package LAB5.task1;

public class CounterOutTask implements Task {

    /* Fields */
    private static int count;

    static {
        count = 0;
    }

    /* Methods */
    public void execute()  {
        count++;
        System.out.println("Numarul noptilor nedormite ca sa fac tema la POO: " + count);
    }
}
