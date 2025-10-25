import java.util.*;

public class SortedMapMethods {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>();

        // insertion
        map.put(12, "Ayushi");
        map.put(2, "Anisha");
        map.put(6, "Anubhav");
        map.put(17, "Anand");

        // iterating on map
        map.forEach((Integer key, String value) -> System.out.println(key + ": " + value));

        // headMap
        System.out.println("headMap(12): " + map.headMap(12));

        // tailMap
        System.out.println("tailMap(6): " + map.tailMap(6));

        // firstKey
        System.out.println("firstKey(): " + map.firstKey());

        // lastKey
        System.out.println("lastKey(): " + map.lastKey());
    }
}
