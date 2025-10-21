import java.util.Arrays;

public class ComparatorDemo {
    public static void main(String[] args) {
        Integer[] arr = {17, 3, 10, 15, 5};

        Arrays.sort(arr, (Integer val1, Integer val2) -> val1-val2);

        for(int val: arr){
            System.out.println(val);
        }
    }
}