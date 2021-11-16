package Constructors_and_References.task1;

public class Complex {
    private int real = 0;
    private int imaginary = 0;

    /* Constructors */
    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    Complex()
    {
        this(0, 0);
    }

    /* Copy constructor */
    Complex(Complex other)
    {
        this.real = other.real;
        this.imaginary = other.imaginary;
    }

    /* Getters and setters */
    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    /* Add to the current complex number another complex number */
    public void addWithComplex(Complex other) {
        this.real += other.real;
        this.imaginary += other.imaginary;
    }

    /* Display the complex number */
    public void showNumber() {
        if(this.real == 0 && this.imaginary == 0) {
            System.out.println(0);
        } else if(this.real == 0 && this.imaginary != 0) {
            System.out.println(this.imaginary + "i");
        } else if(this.real != 0 && this.imaginary == 0) {
            System.out.println(this.real);
        } else if(this.imaginary > 0) {
            System.out.println(this.real + " + " + this.imaginary + "i");
        } else {
            System.out.println(this.real + " " + this.imaginary + "i");
        }
    }

    /* Test */
    public static void main(String[] args) {
        Complex firstNumber = new Complex(2,3);
        Complex secondNumber = new Complex(3,-7);

        /* Display numbers */
        System.out.print("First number: ");
        firstNumber.showNumber();
        System.out.print("Second number: ");
        secondNumber.showNumber();

        /* Add the second number to the first number and display it again */
        firstNumber.addWithComplex(secondNumber);
        System.out.print("First number + Second number: ");
        firstNumber.showNumber();
    }
}
