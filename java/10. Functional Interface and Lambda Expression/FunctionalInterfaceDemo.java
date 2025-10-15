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

class ChildClass implements FunctionalInterface1{
    public void abstractMethod1(){
        System.out.println("This is abstract method");
    }
}

public class FunctionalInterfaceDemo{
    public static void main(String[] args){
        ChildClass obj = new ChildClass();
        obj.abstractMethod1();
        obj.defaultMethod();
        FunctionalInterface1.staticMethod();
    }
}