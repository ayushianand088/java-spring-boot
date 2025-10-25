import java.util.*;

public class NavigableMapMethods {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();

        // insertion
        map.put(12, "Ayushi");
        map.put(2, "Anisha");
        map.put(6, "Anubhav");
        map.put(17, "Anand");

        System.out.println("TreeMap: " + map);

        System.out.println("lowerEntry(17): " + map.lowerEntry(17));

        System.out.println("lowerKey(17): " + map.lowerKey(17));

        System.out.println("floorEntry(18): " + map.floorEntry(18));
        System.out.println("floorEntry(17): " + map.floorEntry(17));

        System.out.println("floorKey(18): " + map.floorKey(18));
        System.out.println("floorKey(17): " + map.floorKey(17));

        System.out.println("ceilingEntry(10): " + map.ceilingEntry(10));
        System.out.println("ceilingEntry(12): " + map.ceilingEntry(12));

        System.out.println("ceilingKey(10): " + map.ceilingKey(10));
        System.out.println("ceilingKey(12): " + map.ceilingKey(12));

        System.out.println("higherEntry(10): " + map.higherEntry(10));
        System.out.println("higherEntry(12): " + map.higherEntry(12));
        System.out.println("higherEntry(17): " + map.higherEntry(17));

        System.out.println("higherKey(10): " + map.higherKey(10));
        System.out.println("higherKey(12): " + map.higherKey(12));
        System.out.println("higherKey(17): " + map.higherKey(17));

        System.out.println("firstEntry(): " + map.firstEntry());

        System.out.println("lastEntry(): " + map.lastEntry());

        System.out.println("descendingMap(): " + map.descendingMap());
        System.out.println("TreeMap: " + map);

        System.out.println("navigableKeySet(): " + map.navigableKeySet());

        System.out.println("descendingKeySet(): " + map.descendingKeySet());

        System.out.println("headMap(6,true)" + map.headMap(6, true));
        System.out.println("headMap(6,false)" + map.headMap(6, false));

        System.out.println("tailMap(6,true)" + map.tailMap(6, true));
        System.out.println("tailMap(6,false)" + map.tailMap(6, false));

        System.out.println("pollFirstEntry(): " + map.pollFirstEntry());
        System.out.println("TreeMap: " + map);

        System.out.println("pollLastEntry(): " + map.pollLastEntry());
        System.out.println("TreeMap: " + map);
    }
}
