import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();

        // insertion
        set1.add(11);
        set1.add(17);
        set1.add(13);
        set1.add(12);

        System.out.println("set1: " + set1);

        Set<Integer> set2 = new HashSet<>();

        // insertion
        set2.add(10);
        set2.add(12);
        set2.add(4);
        set2.add(1);
        set2.add(15);

        System.out.println("set2: " + set2);

        // union of set1 and set2
        set1.addAll(set2);
        System.out.println("set1 union set2: " + set1);

        // intersection of set1 and set2
        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);
        set1.retainAll(set2);
        System.out.println("set1 intersection set2: " + set1);

        // difference of set1 and set2
        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);
        set1.removeAll(set2);
        System.out.println("set1: " + set1);
    }
}
