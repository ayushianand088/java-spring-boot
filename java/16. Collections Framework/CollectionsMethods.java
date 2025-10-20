import java.util.*;

public class CollectionsMethods {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();

        values.add(1);
        values.add(6);
        values.add(3);
        values.add(8);
        values.add(2);

        System.out.println("max value: " + Collections.max(values));
        System.out.println("min value: " + Collections.min(values));
        Collections.sort(values);

        System.out.println("sorted");
        values.forEach((Integer val) -> System.out.println(val));
    }
}
