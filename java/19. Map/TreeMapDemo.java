import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        // natural order
        Map<Integer, String> map1 = new TreeMap<>();

        // insertion
        map1.put(12, "Ayushi");
        map1.put(2, "Anisha");
        map1.put(6, "Anubhav");
        map1.put(17, "Anand");

        // iterating
        map1.forEach((Integer key, String value) -> System.out.println(key + ": " + value));

        System.out.println("--------------");
        // using comparator to sort key in descending
        Map<Integer, String> map2 = new TreeMap<>((Integer key1, Integer key2) -> key2-key1);

        // insertion
        map2.put(12, "Ayushi");
        map2.put(2, "Anisha");
        map2.put(6, "Anubhav");
        map2.put(17, "Anand");

        // iterating
        map2.forEach((Integer key, String value) -> System.out.println(key + ": " + value));
    }
}
