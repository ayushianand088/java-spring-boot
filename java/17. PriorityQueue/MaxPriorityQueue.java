import java.util.PriorityQueue;

public class MaxPriorityQueue {
    public static void main(String[] args) {
        // max priority queue
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((Integer a, Integer b) -> b - a);
        maxPQ.add(5);
        maxPQ.add(2);
        maxPQ.add(8);
        maxPQ.add(1);

        // print all values
        maxPQ.forEach((Integer val) -> System.out.println(val));

        // remove top element from PQ and print
        while (!maxPQ.isEmpty()) {
            int val = maxPQ.poll();
            System.out.println("remove from top: " + val);
        }
    }
}
