package LAB3.task3;

import java.util.Iterator;
import LAB3.task1.CandyBox;
import LAB3.task2.Baravelli;
import LAB3.task2.ChocAmor;
import LAB3.task2.Lindt;
import LAB3.task4.CandyBag;

public class Area {
    private CandyBag my_candy_bag;
    private int number;
    private String street;

    public Area() {
        this.my_candy_bag = null;
        this.number = 0;
        this.street = "";
    }

    public Area(String street, int number) {
        this.street = street;
        this.number = number;
    }

    public CandyBag getMy_candy_bag() {
        return this.my_candy_bag;
    }

    public void setMy_candy_bag(CandyBag my_candy_bag) {
        this.my_candy_bag = my_candy_bag;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void getBirthdayCard(CandyBag my_gift) {
        System.out.println("\nTo mom,\n" + this.street + ", " + this.number + "\n");
        System.out.println("This package contains:");
        System.out.println();
        Iterator var2 = my_gift.getMy_bag().iterator();

        while(var2.hasNext()) {
            CandyBox el = (CandyBox)var2.next();
            if (el instanceof Lindt) {
                System.out.println("Lindt: " + el);
                ((Lindt)el).printLindt();
            } else if (el instanceof Baravelli) {
                System.out.println("Baravelli: " + el);
                ((Baravelli)el).printBaravelliDim();
            } else if (el instanceof ChocAmor) {
                System.out.println("ChocAmor: " + el);
                ((ChocAmor)el).printChocAmor();
            } else {
                System.out.println("Unknown");
            }
        }

        System.out.println("Happy Birthday!\n\nWith love,\nyour son!");
    }
}
