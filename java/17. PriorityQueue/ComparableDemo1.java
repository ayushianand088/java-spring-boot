import java.util.Arrays;

class MyInteger implements Comparable<MyInteger> {
    int value;

    MyInteger(int value) {
        this.value = value;
    }

    public int compareTo(MyInteger other) {
        // return this.value - other.value;
        return other.value - this.value;
    }
}

public class ComparableDemo1 {
    public static void main(String[] args) {
        MyInteger[] arr = {
            new MyInteger(17),
            new MyInteger(3),
            new MyInteger(10),
            new MyInteger(15),
            new MyInteger(5)
        };

        Arrays.sort(arr); // uses compareTo() internally

        for (MyInteger val : arr) {
            System.out.println(val.value);
        }
    }
}
