package InnerClasses.task3;

import InnerClasses.task1.Car;
import InnerClasses.task1.Dealership;
import InnerClasses.task1.Offer;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Test {

    public static void main(String[] args) {
        Car my_car1 = new Car(1000, Car.CarType.BMW, 2019);
        Car my_car2 = new Car(1000, (Car.CarType.LAMBO), 2020);
        Car my_car3 = new Car(1000, (Car.CarType.MERCEDES), 2021);

        System.out.println(my_car1);
        System.out.println(my_car2);
        System.out.println(my_car3 + "\n");

        /* Get final price */
        Dealership my_dealership = new Dealership();
        System.out.println("Dealership offer of car 1: " + my_dealership.getFinalPrice(my_car1) + "$\n");
        System.out.println("Dealership offer of car 2: " + my_dealership.getFinalPrice(my_car2) + "$\n");
        System.out.println("Dealership offer of car 3: " + my_dealership.getFinalPrice(my_car3) + "$\n");

        /* Negociation time */
        System.out.println("Negociating car 1 even further...");
        my_dealership.negotiate(my_car1, new Offer() {
            @Override
            public int getDiscount(Car car) {
                /* the client's offer, with maximum 200$ discount */
                return new Random().nextInt(my_car1.getPrice() - 200, my_car1.getPrice());
            }
        });

        System.out.println("Final price for car_1: " + my_car1.getPrice() + "$");

        /*
        S-au generat toate clasele si interfetele.
        Pt cea anonima:
        my_dealership.negotiate(my_car1, new Offer() {
            public int getDiscount(Car car) {
                return (new Random()).nextInt(my_car1.getPrice() - 200, my_car1.getPrice());
            }
        });

        - de fapt, arata altfel in out, s-a generat un fel de functie lambda, dar cand dau copy paste aici,
         imi insereaza ce e mai sus
         */

        List<Car> my_list = new LinkedList<>();
        my_list.add(my_car1);
        my_list.add(my_car2);
        my_list.add(my_car3);

        System.out.println("\nBefore:");
        my_list.forEach(System.out::println);
        my_list.removeIf((Element) -> {
            if (Element.getPrice() > my_car1.getPrice()) {
                return true;
            }
            else {
                return false;
            }
        });
        System.out.println("Remove cars > " + my_car1.getPrice() + "$ cuz I`m poor");
        my_list.forEach(System.out::println);
    }
}
