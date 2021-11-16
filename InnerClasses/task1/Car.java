package InnerClasses.task1;

public class Car {
    /* Fields */
    public enum CarType {
        BMW,
        MERCEDES,
        LAMBO;
    }

    private CarType myType;
    private int price;
    private int year;

    /* Constructor */
    public Car(int price, CarType myType, int year) {
        this.price = price;
        this.myType = myType;
        this.year = year;
    }

    /* Getters and setters */
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CarType getType() {
        return myType;
    }

    public void setType(CarType type) {
        this.myType = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    /* Methods */
    @Override
    public String toString() {
        return "Car type: " + myType + " from year " + year + " costs " + price + "$";
    }
}
