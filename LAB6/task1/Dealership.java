
package LAB6.task1;
import java.util.Random;

public class Dealership {

    /* Intern class 1 */
    class BrandOffer implements Offer {
        public int getDiscount(Car car) {
            if(car.getType().equals(Car.CarType.BMW)) {
                return (int) (car.getPrice() * 0.9); // 10 %
            } else if(car.getType().equals(Car.CarType.LAMBO)) {
                return (int) (car.getPrice() * 0.8); // 20 %
            } else if(car.getType().equals(Car.CarType.MERCEDES)) {
                return (int) (car.getPrice() * 0.7); // 30 %
            }
            else return 0;
        }
    }

    /* Intern class 2 */
    class DealerOffer implements Offer {
        public int getDiscount(Car car) {
            return car.getPrice() - (2021-car.getYear()) * 100; // lower price with 100 per year
        }
    }

    /* Intern class 3 */
    class SpecialOffer implements Offer {
        public int getDiscount(Car car) {
            return new Random().nextInt(car.getPrice()-100,car.getPrice());
        }
    }

    /* Get final price */
    public int getFinalPrice(Car car) {
        int BrandDiscount = 1000 - new BrandOffer().getDiscount(car);
        int DealerOffer = 1000 - new DealerOffer().getDiscount(car);
        int SpecialOffer = 1000 - new SpecialOffer().getDiscount(car);
        System.out.println("BrandOffer discount: " + BrandDiscount + "$ DealerOffer discount: " + DealerOffer + "$ SpecialOffer discount: " + SpecialOffer + "$");
        int final_price = car.getPrice()-BrandDiscount-DealerOffer-SpecialOffer;
        System.out.println("Car " + car.getType() + " discounted from: " + car.getPrice() + " to " + final_price + "$!");
        car.setPrice(final_price);
        return car.getPrice();
    }

    /* Negotiate price */
    public void negotiate(Car car, Offer offer) {
        int new_price = offer.getDiscount(car);

        System.out.println("The dealership offer was: " + car.getPrice() + "$");
        System.out.println("The client offer was: " + new_price + "$");

        if(new Random().nextBoolean() == true) {
            car.setPrice(new_price);
            System.out.println("The offer was accepted!");
        } else {
            System.out.println("The offer was declined!");
        }
    }
}
