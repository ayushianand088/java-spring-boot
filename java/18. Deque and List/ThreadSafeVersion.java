import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.PriorityBlockingQueue;

public class ThreadSafeVersion {
    public static void main(String[] args) {
        // for PriorityQueue
        PriorityBlockingQueue<Integer> pq = new PriorityBlockingQueue<>();
        pq.add(2);
        pq.add(5);
        System.out.println(pq.peek());

        // for ArrayDequq
        ConcurrentLinkedDeque<Integer> ad = new ConcurrentLinkedDeque<>();
        ad.addLast(2);
        ad.addLast(5);
        System.out.println(ad.removeLast());
    }
}
