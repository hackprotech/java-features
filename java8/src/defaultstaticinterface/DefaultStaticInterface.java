package defaultstaticinterface;

interface Bike {
    void engine();

    default void wheels() {
        System.out.println("Bike should always have 2 wheels!");
    }

    static void fuel() {
        System.out.println("Bike will run on Petrol!");
    }
}


interface SportsBike {
    void engine();

    default void wheels() {
        System.out.println("Sports Bike should always have 2 wheels!");
    }

    static void fuel() {
        System.out.println("Bike will run on Petrol!");
    }
}


class HondaBike implements Bike, SportsBike {

    @Override
    public void engine() {
        System.out.println("Honda Bike - 350cc");
    }

    @Override
    public void wheels() {
        SportsBike.super.wheels();
//        System.out.println("Bike should always have 2 wheels and wheel type is alloy!");
    }
}

class RoyalEnfieldBike implements Bike {

    @Override
    public void engine() {
        System.out.println("Royal Enfield Bike - 650cc");
    }

    @Override
    public void wheels() {
//        Bike.super.wheels();
        System.out.println("Bike should always have 2 wheels and wheel type is normal!");
    }
}

public class DefaultStaticInterface {

    public static void main(String[] args) {

        HondaBike hondaBike = new HondaBike();
        hondaBike.engine();
        hondaBike.wheels();

        RoyalEnfieldBike royalEnfieldBike = new RoyalEnfieldBike();
        royalEnfieldBike.engine();
        royalEnfieldBike.wheels();

        Bike.fuel();

    }

}
