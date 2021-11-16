package Abstractization.Test;

public class TestClass implements TestInterface {
    public void exit() {
        System.out.println("Exiting...");
    }

    public void sayHello() {
        System.out.println("Hello world from the subclass!");
    }
}
