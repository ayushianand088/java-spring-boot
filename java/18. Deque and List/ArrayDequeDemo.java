import java.util.ArrayDeque;

public class ArrayDequeDemo{
    public static void main(String[] args) {
        // ArrayDeque as Queue(FIFO)
        ArrayDeque<Integer> asQueue = new ArrayDeque<>();

        // insertion
        asQueue.addLast(1);
        asQueue.addLast(5);
        asQueue.addLast(3);

        // deletion
        int element = asQueue.removeFirst();
        System.out.println(element);

        // ArrayDeque as Stack(LIFO)
        ArrayDeque<Integer> asStack = new ArrayDeque<>();
        
        // insertion
        asStack.addFirst(1);
        asStack.addFirst(5);
        asStack.addFirst(3);

        // deletion
        int removeElem = asStack.removeFirst();
        System.out.println(removeElem);
    }
}