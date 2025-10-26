import java.util.*;
import java.util.function.DoubleBinaryOperator;
import java.util.stream.*;

public class StreamIntermediateOperations {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,7,3,4,2,5,6,1,7};
        System.out.println("Array: ");
        for(int value: arr1){
            System.out.print(value + " ");
        }

        // filter()
        Stream<Integer> filterArr1 = Arrays.stream(arr1).filter((Integer value) -> value%2 == 0);
        System.out.println("filter(): " + filterArr1.collect(Collectors.toList()));

        // map()
        Stream<Integer> mapArr1 = Arrays.stream(arr1).map((Integer value) -> value*2);
        System.out.println("map(): " + mapArr1.collect(Collectors.toList()));

        // flatMap()
        List<List<String>> sentenceList = Arrays.asList(
            Arrays.asList("My", "name", "is", "Ayushi"),
            Arrays.asList("I", "love", "learning", "new", "skills"),
            Arrays.asList("currently", "I","am","learning","Java")
        );
        Stream<String> wordsStream = sentenceList.stream().flatMap((List<String> sentence) -> sentence.stream());
        System.out.println(wordsStream.collect(Collectors.toList()));

        // distinct
        Stream<Integer> distinctArr = Arrays.stream(arr1).distinct();
        System.out.println("distinct(): " + distinctArr.collect(Collectors.toList()));

        // sorted
        Stream<Integer> sortedArr = Arrays.stream(arr1).sorted();
        System.out.println("sorted(): " + sortedArr.collect(Collectors.toList()));

        // peek()
        Stream<Integer> peekArr = Arrays.stream(arr1).filter((Integer value) -> value%2 == 0).peek((Integer value) -> System.out.print(value + " ")).map((Integer value) -> value*2);
        System.out.println("result: " + peekArr.collect(Collectors.toList()));

        // limit()
        Stream<Integer> limitArr = Arrays.stream(arr1).limit(3);
        System.out.println("limit(): " + limitArr.collect(Collectors.toList()));

        // skip()
        Stream<Integer> skipArr = Arrays.stream(arr1).skip(3);
        System.out.println("skip(): " + skipArr.collect(Collectors.toList()));

        // mapToInt()
        List<String> numbers = Arrays.asList("1","2","1","0","9","4","7","5");
        IntStream numberStream = numbers.stream().mapToInt((String val) -> Integer.parseInt(val));
        int[] numberArray = numberStream.toArray();
        System.out.println("mapToInt(): ");
        for(int num: numberArray){
            System.out.print(num + " ");
        }

        // mapToLong()
        List<String> longNumbers = Arrays.asList("1","2","1","0","9","4","7","5");
        LongStream longNumStream = longNumbers.stream().mapToLong((String val) -> Long.parseLong(val));
        long[] longNumArray = longNumStream.toArray();
        System.out.println("mapToLong(): ");
        for(long num: longNumArray){
            System.out.print(num + " ");
        }

        // mapToDouble()
        List<String> doubleNumbers = Arrays.asList("1.8","2.0","1.1","0","9.5","4.9","7.3","5.3");
        DoubleStream doubleNumStream = doubleNumbers.stream().mapToDouble((String val) -> Double.parseDouble(val));
        double[] doubleNumArray = doubleNumStream.toArray();
        System.out.println("mapToDouble(): ");
        for(double num: doubleNumArray){
            System.out.print(num + " ");
        }
    }
}
