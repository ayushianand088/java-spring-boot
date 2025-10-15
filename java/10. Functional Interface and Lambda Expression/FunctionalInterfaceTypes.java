@FunctionalInterface
interface Consumer<T>{
    void accept(T t);
}

@FunctionalInterface
interface Supplier<T>{
    T get();
}

@FunctionalInterface
interface Function<T, R>{
    R apply(T t);
}

@FunctionalInterface
interface Predicate<T>{
    boolean test(T t);
}

public class FunctionalInterfaceTypes {
    public static void main(String[] args) {
        // Consumer – takes input, returns nothing
        Consumer<String> consumer = (name) -> {
            System.out.println("Name is " + name);
        };
        consumer.accept("Ayushi");

        Supplier<Double> supplier = () -> {
            return Math.random();
        };
        supplier.get();

        Function<Integer, String> function = (num) -> {
            return num.toString();
        };
        System.out.println(function.apply(70));

        Predicate<Integer> predicate = (age) -> {
            return age >= 18;
        };
        System.out.println("Is Adult: " + predicate.test(22));
    }
}
