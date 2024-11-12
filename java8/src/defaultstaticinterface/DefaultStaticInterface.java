package defaultstaticinterface;


import java.util.List;

interface Bike {
    void engine();
    default void wheels() {
        System.out.println("Bike have 2 wheels");
    }
    static void fuel() {
        System.out.println("Fuel: Petrol");
    }
}

interface SportsBike {
    void engine();
    default void wheels() {
        System.out.println("Sports Bike have 2 wheels");
    }
    static void fuel() {
        System.out.println("Fuel: Petrol");
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
//        System.out.println("It have two wheels with tubeless tyres");
    }
}

class RoyalEnfieldBike implements Bike {

    @Override
    public void engine() {
        System.out.println("Royal Enfield Bike - 650cc");
    }
}

public class DefaultStaticInterface {

    public static void main(String[] args) {

        HondaBike hondaBike = new HondaBike();
        hondaBike.engine();
        hondaBike.wheels();
        Bike.fuel();

        RoyalEnfieldBike royalEnfieldBike = new RoyalEnfieldBike();
        royalEnfieldBike.engine();
        royalEnfieldBike.wheels();

    }

}
