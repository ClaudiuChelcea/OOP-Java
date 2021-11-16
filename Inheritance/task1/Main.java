package Inheritance.task1;

import java.util.ArrayList;
import Inheritance.task2.Baravelli;
import Inheritance.task2.ChocAmor;
import Inheritance.task2.Lindt;
import Inheritance.task3.Area;
import Inheritance.task4.CandyBag;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Baravelli mynewbox = new Baravelli("Vanilla", "Germany", 2.0F, 1.0F);
        System.out.println(mynewbox);
        Lindt myothernewbox = new Lindt("Blueberry", "Italy", 1.0F, 2.0F, 3.0F);
        System.out.println(myothernewbox);
        ChocAmor mylastbox = new ChocAmor("Strawberry", "Spain", 4.0F);
        System.out.println(mylastbox);
        System.out.println(myothernewbox.equals(myothernewbox));
        System.out.println(myothernewbox.equals(new Lindt("Blueberry", "Italy", 1.0F, 2.0F, 3.0F)));
        Area my_area = new Area("Spaiul Independentei", 7);
        ArrayList my_gift = new ArrayList();
        my_gift.add(mynewbox);
        my_gift.add(myothernewbox);
        my_gift.add(mylastbox);
        CandyBag my_giftbox = new CandyBag(my_gift);
        my_area.getBirthdayCard(my_giftbox);
    }
}
