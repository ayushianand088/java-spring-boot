import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();

        // add(int index, Element e)
        list1.add(0, 100);
        list1.add(1, 300);
        list1.add(2, 400);
        list1.add(3, 200);
        System.out.println("list1: " + list1);

        // addAll(int index, Collection c)
        List<Integer> list2 = new ArrayList<>();
        list2.add(0, 120);
        list2.add(1, 130);
        list2.add(2, 490);
        list2.add(3, 280);
        System.out.println("list2: " + list2);

        // addAll(int index, Collection c)
        list1.addAll(2, list2);
        System.out.println("added list2 in list1 at index 2: " + list1);

        // replaceAll(UnaryOperator op)
        list2.replaceAll((Integer val) -> val - 50);
        System.out.println("replaced list2 value with (value - 50): " + list2);

        // sort(Comparator c)
        list1.sort((a, b) -> a - b);
        System.out.println("list1 sorted in ascending order: " + list1);

        // get(int index)
        int element = list1.get(2);
        System.out.println("element at index 2 in list1: " + element);

        // set(int index, Element e)
        list1.set(2, 150);
        System.out.println("set 150 at index 2 in list1: " + list1);

        // remove(int index)
        list1.remove(2);
        System.out.println("index 2 element removed in list1: " + list1);

        // indexOf(Object e)
        int index = list1.indexOf(300);
        System.out.println("index of 300 in list1: " + index);

        // listIterator
        ListIterator<Integer> listIterator1 = list1.listIterator(list1.size());

        // traversing backword direction
        System.out.println("traversing backward");
        while (listIterator1.hasPrevious()) {
            int previousVal = listIterator1.previous();
            System.out.println("value: " + previousVal + " nextIndex: " + listIterator1.nextIndex());
        }

        // traversing forward direction
        System.out.println("traversing forward");
        ListIterator<Integer> listIterator2 = list1.listIterator();
        while (listIterator2.hasNext()) {
            int value = listIterator2.next();
            System.out.println("value: " + value + " nextIndex:  " + listIterator2.nextIndex() + " previousIndex: "
                    + listIterator2.previousIndex());
        }

        // sublist(int formIndex, int toIndex)
        List<Integer> subList = list1.subList(1, 4);
        System.out.println("list1 sublist from index 1 to 4: " + subList);
    }
}