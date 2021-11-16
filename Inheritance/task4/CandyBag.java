package Inheritance.task4;

import java.util.ArrayList;
import Inheritance.task1.CandyBox;

public class CandyBag {
    ArrayList<CandyBox> my_bag;

    public CandyBag(ArrayList<CandyBox> my_bag) {
        this.my_bag = my_bag;
    }

    public ArrayList<CandyBox> getMy_bag() {
        return this.my_bag;
    }

    public void setMy_bag(ArrayList<CandyBox> my_bag) {
        this.my_bag = my_bag;
    }
}
