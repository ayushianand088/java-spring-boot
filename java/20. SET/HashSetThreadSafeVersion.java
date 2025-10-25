import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class HashSetThreadSafeVersion {
    public static void main(String[] args) {

        // thread safe
        ConcurrentHashMap<Integer, Boolean> concurrentHashMap = new ConcurrentHashMap<>();
        Set<Integer> threadSafeSet = concurrentHashMap.keySet(Boolean.TRUE);

        threadSafeSet.add(5);
        threadSafeSet.add(0);
        threadSafeSet.add(10);
        threadSafeSet.add(8);
        threadSafeSet.add(15);

        Iterator<Integer> iterate = threadSafeSet.iterator();
        while (iterate.hasNext()) {
            int value = iterate.next();
            System.out.println(value);
            if(value%5 != 0){
                System.out.println(value + " is not divisible by 5");
                threadSafeSet.add(50);
            }
        }


        // without thread safe
        Set<Integer> set1 = new HashSet<>();

        // insertion
        set1.add(5);
        set1.add(0);
        set1.add(10);
        set1.add(8);
        set1.add(15);

        // traversal
        Iterator<Integer> iterator = set1.iterator();
        while (iterator.hasNext()) {
            int value = iterator.next();
            System.out.println(value);
            if(value%5 != 0){
                System.out.println(value + " is not divisible by 5");
                // problem: wihout thread safe, addition of element while iterating is not allowed
                // set1.add(50);
            }
        }
    }
}
