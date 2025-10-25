import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

        // insertion
        set.add(10);
        set.add(12);
        set.add(4);
        set.add(1);
        set.add(15);

        // itreate
        Iterator<Integer> iterable = set.iterator();
        while (iterable.hasNext()) {
            int value = iterable.next();
            System.out.println(value);
        }
    }
}
