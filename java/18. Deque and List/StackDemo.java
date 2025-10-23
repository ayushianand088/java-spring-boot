import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(5);
        stack.push(8);
        stack.push(3);

        System.out.println("Stack: " + stack);

        System.out.println("Deleted last element: " + stack.pop());
    }
}
