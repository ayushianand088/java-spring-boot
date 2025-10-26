import java.util.*;
import java.util.stream.*;

public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);
        Stream<Integer> numberStream = numbers.stream()
            .filter((Integer value) -> value >= 3)
            .peek((Integer value) -> System.out.println("after filter: " + value))
            .map((Integer value) -> (value * -1))
            .peek((Integer value) -> System.out.println("after map: " + value))
            .sorted()
            .peek((Integer value) -> System.out.println("after sorted: " + value));

        List<Integer> invokeNumberStream = numberStream.collect(Collectors.toList());
    }
}
