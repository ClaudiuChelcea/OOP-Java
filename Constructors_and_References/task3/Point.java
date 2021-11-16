package Constructors_and_References.task3;

public class Point {

    /* Fields */
    private float x = 0f;
    private float y = 0f;

    /* Getters and setters */
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    /* Constructor */
    Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /** Change the coordinates
     * @param x x coordinate
     * @param y y coordinate
     * @return nothing, just change the coordinates
     */
    public void changeCoords(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /* Display coordinates */
    public void showCoordinates() {
        System.out.printf("(%0.0d, %0.0d)\n", this.x, this.y);
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
