package Inheritance.task2;

import Inheritance.task1.CandyBox;

public class Lindt extends CandyBox {
    private float length;
    private float width;
    private float height;

    public float getLength() {
        return this.length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return this.width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return this.height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Lindt() {
        this.length = 0.0F;
        this.width = 0.0F;
        this.height = 0.0F;
    }

    public Lindt(float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Lindt(String flavor, String origin, float length, float width, float height) {
        super(flavor, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public float getVolume() {
        return this.length * this.width * this.height;
    }

    public String toString() {
        String var10000 = super.getOrigin();
        return "The " + var10000 + " " + super.getFlavor() + " has volume " + this.getVolume() + ".";
    }

    public void printLindt() {
        System.out.println("Length: " + this.length + " | Width: " + this.width + " | Height: " + this.height + ".");
    }
}
