package anonymousclass;


interface Bike {

    void fuelType();

}

class Employee {
    public void getRole() {
        System.out.println("Current Role is ADMIN!");
    }
}


public class AnonymousClass {

    public static void main(String[] args) {

        // Bike hondaBike = new Bike();
        Bike hondaBike = new Bike() {
            @Override
            public void fuelType() {
                System.out.println("Honda Bike will run on Petrol!");
            }
        };

        hondaBike.fuelType();

        Bike heroBike = new Bike() {
            @Override
            public void fuelType() {
                System.out.println("Hero Bike will run on Electric!");
            }
        };

        heroBike.fuelType();


        String developerName = "Vengat";

//        developerName = "John";

        Employee developer = new Employee() {
            @Override
            public void getRole() {
                System.out.println(developerName + " - Current Role is Developer");
            }
        };

        developer.getRole();


    }

}
