import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        System.out.println("------LinkedHashMap(maintain insertion order)------");

        Map<Integer, String> map = new LinkedHashMap<>();

        // inserting element
        map.put(12, "Ayushi");
        map.put(6, "Anubhav");
        map.put(2, "Anisha");
        map.put(17, "Anand");

        // iterating
        map.forEach((Integer key, String val) -> System.out.println(key + ":" + val));

        System.out.println("------LinkedHashMap(maintain access order)------");

        Map<Integer, String> map1 = new LinkedHashMap<>(16, .75F, true);
        // inserting element
        map1.put(12, "Ayushi");
        map1.put(6, "Anubhav");
        map1.put(2, "Anisha");
        map1.put(17, "Anand");

        // accessing some data
        map1.get(6);

        // iterating
        map1.forEach((Integer key, String val) -> System.out.println(key + ":" + val));

        // explicit thread safe LinkedHashMap
        Map<Integer, String> map2 = Collections.synchronizedMap(new LinkedHashMap<>());

        map2.put(1, "Ayushi");

        System.out.println("------HashMap------");
        // does not maintain insertion order
        Map<Integer, String> normalMap = new HashMap<>();

        // inserting element
        normalMap.put(12, "Ayushi");
        normalMap.put(6, "Anubhav");
        normalMap.put(2, "Anisha");
        normalMap.put(17, "Anand");

        // iterating
        normalMap.forEach((Integer key, String val) -> System.out.println(key + ":" + val));
    }
}
