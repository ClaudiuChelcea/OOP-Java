package LAB3.task2;

import LAB3.task1.CandyBox;

public class ChocAmor extends CandyBox {
    private float length;

    ChocAmor() {
        this.length = 0.0F;
    }

    public ChocAmor(float length) {
        this.length = length;
    }

    public ChocAmor(String flavor, String origin, float length) {
        super(flavor, origin);
        this.length = length;
    }

    public float getLength() {
        return this.length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getVolume() {
        return this.length * this.length * this.length;
    }

    public String toString() {
        String var10000 = super.getOrigin();
        return "The " + var10000 + " " + super.getFlavor() + " has volume " + this.getVolume() + ".";
    }

    public void printChocAmor() {
        System.out.println("Length: " + this.length + ".");
    }
}
