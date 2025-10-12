class Print<T>{
    T value;
}

public class RawType {
    public static void main(String[] args) {
        // Raw type (no <T> specified)
        Print obj = new Print();
        obj.value = "Hello";
        obj.value = 123;
    }
}
