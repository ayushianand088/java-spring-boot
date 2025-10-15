@FunctionalInterface
interface FunctionalInterface1{
    void abstractMethod1();
}

@FunctionalInterface
interface FunctionalInterface2{
    void name(String name);
}

public class LambdaExpression {
    public static void main(String[] args) {
        FunctionalInterface1 obj1 = () -> {
            System.out.println("Abstract Method implementation");
        };
        obj1.abstractMethod1();

        FunctionalInterface2 obj2 = (String name) -> {
            System.out.println("Name is " + name);
        };
        obj2.name("Ayushi Anand");
    }
}
