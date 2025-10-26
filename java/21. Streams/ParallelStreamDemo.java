import java.util.*;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 110);

        // sequential processing
        long sequentialProcessinngStartTime = System.currentTimeMillis();
        numbers.stream()
                .map((Integer val) -> val * val)
                .forEach((Integer val) -> System.out.print(val + " "));
        System.out.println("Sequential processing Time Taken: "
                + (System.currentTimeMillis() - sequentialProcessinngStartTime) + " miliseconds");

        // parallel processing
        long parallelProcessinngStartTime = System.currentTimeMillis();
        numbers.parallelStream()
                .map((Integer val) -> val * val)
                .forEach((Integer val) -> System.out.print(val + " "));
        System.out.println("Parallel processing Time Taken: "
                + (System.currentTimeMillis() - parallelProcessinngStartTime) + " miliseconds");

    }
}
