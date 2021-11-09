package LAB5.task3;

public class Operation implements Div, Minus, Mult, Plus {
    float my_nr = 0;

    public Operation(float my_nr) {
        this.my_nr = my_nr;
    }

    public float getMy_nr() {
        return my_nr;
    }

    public void setMy_nr(float my_nr) {
        this.my_nr = my_nr;
    }

    public void div(float i) {
        if(i==0)
            return;
        my_nr = my_nr / i;
    }

    public void mult(float i) {
        my_nr = my_nr * i;
    }

    public void minus(float i) {
        my_nr = my_nr - i;
    }

    public void plus(float i) {
        my_nr = my_nr + i;
    }

    public float getNumber() {
        return (int) my_nr;
    }
}
