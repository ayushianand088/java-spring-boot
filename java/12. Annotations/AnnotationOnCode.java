import java.util.List;

class Class1 {
    @Deprecated
    void method1() {
        System.out.println("Method 1 is deprecated");
    }

    void method2() {
        System.out.println("Method 2");
    }
}

class Class2 extends Class1 {
    // @Override
    // void method(){
    // System.out.println("Compile time error as this overriden method is not there
    // in parent class Class1");
    // }

    @Override
    void method2() {
        System.out.println("Compile time error as this overriden method is not there in parent class Class1");
    }
}

@FunctionalInterface
interface interface1 {
    void abstractMethod();
}

class Class3 {
    @SafeVarargs
    final void heapPollutionDemo(List<Integer>... numbers) {
        // variable arguments stored as Object
        Object[] arr = numbers;
        // heap pollution: putting List<String> into List<Integer>
        arr[0] = List.of("Hello");
        // run time error (ClassCastException)
        // System.out.println(numbers[0].get(0) + 1);
    }
}

public class AnnotationOnCode {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Class1 obj1 = new Class1();

        obj1.method1();
        obj1.method2();

        Class2 obj2 = new Class2();

        Class3 obj3 = new Class3();
        // Causes ArrayStoreException
        obj3.heapPollutionDemo(List.of(10,20,30));
    }
}