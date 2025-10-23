import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();

        // using deque functionality
        list1.addLast(200);
        list1.addLast(400);
        list1.addLast(500);
        list1.addLast(300);
        list1.addFirst(100);
        System.out.println("Linked list1: " + list1);
        System.out.println("Linked list1 first element: " + list1.getFirst());

        // using list functionality
        LinkedList<Integer> list2 = new LinkedList<>();
        
        list2.add(0,120);
        list2.add(1,590);
        list2.add(0,170);
        list2.add(1,300);

        System.out.println("Linked list2: " + list2);
        System.out.println("Linked list2 element at index 1: " + list2.get(1));
        System.out.println("Linked list2 element at index 2: " + list2.get(2));
    }
}
