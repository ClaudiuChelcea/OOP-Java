package Junit_and_generics.task2;

public class MyMatrix implements Summable {
    public int[][] my_matrix = new int[4][4];

    public MyMatrix(int[][] ints) {
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                my_matrix[i][j] = ints[i][j];
            }
        }
    }

    @Override
    public void addValue(Summable value) {
        for(int i = 0; i < 4; ++i) {
            for(int j = 0; j < 4; ++j) {
                my_matrix[i][j] = my_matrix[i][j] + ((MyMatrix) value).my_matrix[i][j];
            }
        }
    }

    @Override
    public String toString() {
        String out = "";
        for(int i = 0; i < 4; ++i) {
            for(int j = 0; j < 4; ++j) {
                out += String.valueOf(((int) my_matrix[i][j]));
                out += " ";
            }
            out += "\n";
        }

        return out;
    }
}

