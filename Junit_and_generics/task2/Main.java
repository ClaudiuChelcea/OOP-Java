package Junit_and_generics.task2;

import java.util.ArrayList;

public class Main {

    public static void main(final String[] args) {
        // Create array
        ArrayList<Summable> my_Array = new ArrayList<>();

        // Create three vectors
        Vector3 my_vect1 = new Vector3(1,1,1);
        Vector3 my_vect2 = new Vector3(2,2,2);
        Vector3 my_vect3 = new Vector3(3,3,3);

        // Add them
        my_vect1.addValue(my_vect2);
        my_vect1.addValue(my_vect3);

        // Display and add to collection
        System.out.println(my_vect1);
        my_Array.add(my_vect1);

        // Create three matrixes
        MyMatrix m1 = new MyMatrix(new int[][]{new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 1}});
        MyMatrix m2 = new MyMatrix(new int[][]{new int[]{2, 2, 2, 2}, new int[]{2, 2, 2, 2}, new int[]{2, 2, 2, 2}, new int[]{2, 2, 2, 2}});
        MyMatrix m3 = new MyMatrix(new int[][]{new int[]{3, 3, 3, 3}, new int[]{3, 3, 3, 3}, new int[]{3, 3, 3, 3}, new int[]{3, 3, 3, 3}});

        // Add them
        m1.addValue(m2);
        m1.addValue(m3);

        // Display and add to collection
        System.out.println("\n" + m1);
        my_Array.add(m1);

        // Display sum of array
        Methods methods = new Methods();
        System.out.println(methods.returnElementsSum(my_Array)); // 96 + 18, the sum of elements from each
    }
}
