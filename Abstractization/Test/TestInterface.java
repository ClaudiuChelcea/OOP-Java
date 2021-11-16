package Abstractization.Test;

public interface TestInterface {
    default void sayHello() {
        System.out.println("Hello world!");
    }

    static int x = 0;
    static final int y = 0;

    void exit();
}
