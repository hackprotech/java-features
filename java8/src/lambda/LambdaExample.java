package lambda;


import java.util.function.Consumer;

//@FunctionalInterface
interface Bike {

    void transmissionType();
//    void fuelType();

}


public class LambdaExample {

    public static void main(String[] args) {

        Bike sportsBike = () -> {
            System.out.println("Sports Bike always have gears");
            System.out.println("Sports Bike always have gears - Sample");
        };
        sportsBike.transmissionType();

        // () ->

        // Consumer
        Consumer<String> consumerEx = (String s) -> System.out.println(s);
        consumerEx.accept("Hello Vengat!");

    }

}
