import java.util.*;

public class CollectionMethods {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();

        // insert element
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(4);
        values.add(3);

        // size
        System.out.println("Size: " + values.size());

        // isEmpty
        System.out.println("isEmpty: " + values.isEmpty());

        // contains
        System.out.println("contains: " + values.contains(5));

        // remove using index
        values.remove(3);

        // remove using index, remove first occurence of value
        values.remove(Integer.valueOf(3));

        Stack<Integer> stackValues = new Stack<>();
        stackValues.add(6);
        stackValues.add(8);
        stackValues.add(10);
        stackValues.add(5);

        // addAll
        values.addAll(stackValues);

        // containsAll
        System.out.println("containsAll: " + values.containsAll(stackValues));

        // removeAll
        values.removeAll(stackValues);

        // clear
        values.clear();
        System.out.println("clear: " + values.isEmpty());
    }
}
