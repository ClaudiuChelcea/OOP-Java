package LAB3.task2;

import LAB3.task1.CandyBox;

public class Baravelli extends CandyBox {
    private float radius;
    private float height;

    Baravelli() {
        this.radius = 0.0F;
        this.height = 0.0F;
    }

    public Baravelli(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    public Baravelli(String flavor, String origin, float radius, float height) {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }

    public float getRadius() {
        return this.radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return this.height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getVolume() {
        return 3.14F * this.radius * this.radius * this.height;
    }

    public String toString() {
        String var10000 = super.getOrigin();
        return "The " + var10000 + " " + super.getFlavor() + " has volume " + this.getVolume() + ".";
    }

    public void printBaravelliDim() {
        System.out.println("Radius: " + this.radius + " | Height: " + this.height + ".");
    }
}
