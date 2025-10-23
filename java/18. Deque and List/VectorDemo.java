import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> obj = new Vector<>();

        obj.add(0,200);
        obj.add(1,250);
        obj.add(2,100);
        obj.add(3,500);

        System.out.println("Vector: " + obj);
        System.out.println("element at index 2: " + obj.get(2));
    }
}