package streamex;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        // Collection
        List<Integer> numbers = Arrays.asList(1, 4, 5, 6, 2, 3);
        Stream<Integer> numbersStream =  numbers.stream();
        Stream<Integer> filteredStream = numbersStream.filter((element) ->  {
//            System.out.printf("Some Operations Happened");
            return element % 2 == 0;
        });
        System.out.println("After Operation");


        filteredStream.forEach((ele) -> System.out.println(ele));

        // Arrays
        Stream<String> userNames = Arrays.stream(new String[]{"john", "jai", "poovi"});

        userNames
                .filter(ele -> ele.length() > 3)
                .forEach(elements -> System.out.println(elements));


        // Stream.of
        Stream<Integer> transformNumberStream = Stream.of(1, 2, 3, 4, 5);
        transformNumberStream
                .map(ele -> ele * 2)
                .forEach(ele -> System.out.println(ele));

        // Stream.generate
        Stream.generate(() -> Math.random())
                .limit(10)
                .forEach(ele -> System.out.println(ele));

        // Stream.iterate
        Stream.iterate(0, n -> n + 1)
                .limit(5)
                .forEach(ele -> System.out.println(ele));

    }


}
