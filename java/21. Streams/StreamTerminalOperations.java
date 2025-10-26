import java.util.*;
import java.util.stream.*;

public class StreamTerminalOperations {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);

        // forEach()
        System.out.println("forEach()");
        numbers.stream()
            .filter((Integer val) -> val >= 3)
            .forEach((Integer val) -> System.out.println(val));

        // toArray()
        System.out.println("toArray()");
        Object[] arr = numbers.stream()
            .filter((Integer val) -> val >= 3)
            .toArray();
        System.out.println(Arrays.toString(arr));

        // reduce()
        System.out.println("reduce()");
        Optional<Integer> reducedValue = numbers.stream().reduce((Integer val1, Integer val2) -> val1+val2);
        System.out.println(reducedValue.get());

        // collect()
        System.out.println("collect()");
        List<Integer> collectedNumber = numbers.stream()
            .filter((Integer val) -> val>=3)
            .collect(Collectors.toList());
        System.out.println(collectedNumber);

        // min() 
        System.out.println("min()");
        Optional<Integer> minValue = numbers.stream()
            .filter((Integer val) -> val>=3)
                .min((Integer val1, Integer val2) -> val1-val2);
        System.out.println(minValue);

        // max()
        System.out.println("max()");
        Optional<Integer> maxValue = numbers.stream()
            .filter((Integer val) -> val>=3)
                .max((Integer val1, Integer val2) -> val1-val2);
        System.out.println(maxValue);

        // count()
        System.out.println("count()");
        long noOfValues = numbers.stream().count();
        System.out.println(noOfValues);

        // anyMatch()
        System.out.println("anyMatch()");
        boolean anyValueGreaterTo3 = numbers.stream().anyMatch((Integer val) -> val>=3);
        System.out.println(anyValueGreaterTo3);

        // allMatch()
        System.out.println("allMatch()");
        boolean allValueGreaterTo3 = numbers.stream().allMatch((Integer val) -> val>=3);
        System.out.println(allValueGreaterTo3);

        // noneMatch()
        System.out.println("noneMatch()");
        boolean noneValueLessTo0 = numbers.stream().noneMatch((Integer val) -> val<0);
        System.out.println(noneValueLessTo0);

        // findFirst()
        System.out.println("findFirst()");
        Optional<Integer> firstNum = numbers.stream().findFirst();
        System.out.println(firstNum);

        // findAny()
        System.out.println("findAny()");
        Optional<Integer> anyNum = numbers.stream().findAny();
        System.out.println(anyNum);
    }
}
