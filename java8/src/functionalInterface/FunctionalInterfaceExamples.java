package functionalInterface;


import java.util.function.*;

@FunctionalInterface
interface Employee {
    void calculateSalary();

    default void addressInfo() {
        System.out.println("Employee Address!");
    }

    static void currentAddressInfo() {
        System.out.println("Employee Current Address!");
    }
}


public class FunctionalInterfaceExamples {

    public static void main(String[] args) {

        Employee employee = new Employee() {
            @Override
            public void calculateSalary() {
                System.out.println("Calculating Employee Salary!");
            }
        };

        employee.calculateSalary();


        // Consumer
        Consumer<String> consumerEx = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        consumerEx.accept("Hello Vengat!");

        // Supplier
        Supplier<String> supplierEx = new Supplier<String>() {
            @Override
            public String get() {
                return "Welcome to the Community!";
            }
        };

        System.out.println(supplierEx.get());

        // Predicate
        Predicate<String> predicateEx = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 1;
            }
        };

        System.out.println(predicateEx.test("Sample"));
        System.out.println(predicateEx.test("s"));

        // Function
        Function<String, Integer> functionEx = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        System.out.println(functionEx.apply("testValue"));

        // Unary Operator
        UnaryOperator<Integer> unaryOperator = new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * integer;
            }
        };

        System.out.println(unaryOperator.apply(5));

        // Binary Operator
        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer * integer;
            }
        };

        System.out.println(binaryOperator.apply(10, 20));
    }

}
