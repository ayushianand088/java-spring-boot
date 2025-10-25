import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();

        // insertion
        treeSet.add(10);
        treeSet.add(12);
        treeSet.add(4);
        treeSet.add(1);
        treeSet.add(15);

        Iterator<Integer> iterable = treeSet.iterator();
        while (iterable.hasNext()) {
            int value = iterable.next();
            System.out.println(value);
        }
    }
}
