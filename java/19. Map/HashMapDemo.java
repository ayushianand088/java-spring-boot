import java.util.Map;
import java.util.Collection;
import java.util.HashMap;

public class HashMapDemo{
    public static void main(String[] args) {
        Map<Integer, String> rollAndNameMap = new HashMap<>();

        // put()
        rollAndNameMap.put(null, "Test");
        rollAndNameMap.put(0, null);
        rollAndNameMap.put(1, "Ayushi");
        rollAndNameMap.put(2, "Anisha");
        rollAndNameMap.put(3, "Anubhav");

        // replace if absent(null)
        rollAndNameMap.putIfAbsent(null, "Anand");
        rollAndNameMap.putIfAbsent(0, "Zero");

        // iterate HashMap
        for(Map.Entry<Integer, String> entryMap: rollAndNameMap.entrySet()){
            Integer key = entryMap.getKey();
            String value = entryMap.getValue();
            System.out.println("Key: " + key + " Value: " + value);
        }
        System.out.println("Printing HashMap Directly: " + rollAndNameMap);

        // isEmpty
        System.out.println("isEmpty(): " + rollAndNameMap.isEmpty());

        // size
        System.out.println("size: " + rollAndNameMap.size());

        // containsKey
        System.out.println("containsKey(3): " + rollAndNameMap.containsKey(3));

        // get(key)
        System.out.println("get(1): " + rollAndNameMap.get(1));

        // getOrDefault(key)
        System.out.println("getOrDefault(9, 'Anand'): " + rollAndNameMap.getOrDefault(9, "Anand"));

        // remove(key) then get(key)
        System.out.println("remove(0): " + rollAndNameMap.remove(0));
        System.out.println("get(0): " + rollAndNameMap.get(0));

        // keySet() => iteraring over keys
        for(Integer key: rollAndNameMap.keySet()){
            System.out.println("Key: " + key);
        }

        // values() => iterating over values
        Collection<String> values = rollAndNameMap.values();
        for(String value: values){
            System.out.println("value: " + value);
        }
    }
}