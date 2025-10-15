@FunctionalInterface
interface FunctionalInterface1{
    // Functional interface can have only one abstract method 
    void abstractMethod1();
    // it can have other methods like default, static, or methods inherited from Object class.
    default void defaultMethod(){
        System.out.println("Default Method");
    }
    static void staticMethod(){
        System.out.println("Static Method");
    }
    // Object class method
    String toString();
}

// Functional Interface implementation using "implements" keyword
class ChildClass implements FunctionalInterface1{
    public void abstractMethod1(){
        System.out.println("abstract method implementation");
    }
}

public class FunctionalInterfaceDemo{
    public static void main(String[] args){
        ChildClass obj = new ChildClass();
        obj.abstractMethod1();
        obj.defaultMethod();
        FunctionalInterface1.staticMethod();

        // Functional interface implementation using Anonymous Class
        FunctionalInterface1 obj2 = new FunctionalInterface1() {
            public void abstractMethod1(){
                System.out.println("Abstract Method implementation");
            }
        };
        obj2.abstractMethod1();
    }
}