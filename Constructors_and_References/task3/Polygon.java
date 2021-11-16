package Constructors_and_References.task3;

import java.util.ArrayList;

public class Polygon {
    /* Fields */
    private int num_corners = 0;
    Point[] corners;


    /* Getters and setters */
    public int getNum_corners() {
        return num_corners;
    }

    public void setNum_corners(int num_corners) {
        this.num_corners = num_corners;
    }

    /* Constructors */
    Polygon(int num_corners) {
        this.num_corners = num_corners;
        corners = new Point[this.num_corners];
        for(Point my_point : corners) {
            my_point = new Point(0, 0);
        }
    }

    Polygon(ArrayList<Integer> corners_coordinates) {
        this(corners_coordinates.size());
        for(int i = 0; i < this.num_corners; i = i + 2) {
            if(corners[i/2] == null)
                corners[i/2] = new Point(0,0);
            corners[i / 2].changeCoords(corners_coordinates.get(i), corners_coordinates.get(i + 1));
        }
    }

    /* Display polygon function */
    public void displayME()
    {
        for(Point my_point : corners) {
            if(my_point == null)
                break;
            System.out.print(my_point + " ");
        }
    }

    /* Test */
    public static void main(String[] args) {
        /* Create array and add elements */
        ArrayList<Integer> my_coordinates = new ArrayList<Integer>();
        for(int i = 0; i < 10; ++i)
            my_coordinates.add(i);

        /* Create polygon */
        Polygon my_poligon = new Polygon(my_coordinates);

        /* Display polygon */
        my_poligon.displayME();
    }
}
