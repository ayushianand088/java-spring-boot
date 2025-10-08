abstract class Person {
    // Abstract Method(only declare in abstract class, implemented in subclass)
    abstract void work();
}

class Engineer extends Person{
    void work(){
        System.out.println("Coding");
    }
}

class Animal {
    // overriden method(subclass has same method as of parent class)
    void type() {
        System.out.println("Animal class");
    }
    // Final Method(implementation can not be changed)
    final void className(){
        System.out.println("Animal");
    }
}

class Dog extends Animal {
    void type() {
        System.out.println("Dog class");
    }
    // final method can not be override
    // void className(){
    //     System.out.println("Dog");
    // }
}

public class MethodTypes {
    // user defined method
    public void square(int n) {
        int result = n * n;
        System.out.println("Square of " + n + " is " + result);
    }

    // overloaded method
    public void sum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }

    public void sum(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + result);
    }

    // Static -> assosiated with class, Non static -> assosiated with object
    // Static Method
    public static void staticMethod(){
        System.out.println("Static Method called...");
    }

    public static void main(String[] args) {
        MethodTypes obj = new MethodTypes();
        Animal a = new Dog();
        // instance is Dog, so first type method is searched in Dog, if not present then in Animal
        a.type();
        // Static Method called using class name
        MethodTypes.staticMethod();
        int num = 25;

        // System defined method
        double sqrt = Math.sqrt(num);
        System.out.println("Square root of " + num + " is " + sqrt);

        obj.square(num);

        obj.sum(2, 8);
        obj.sum(4, 5, 10);
    }
}