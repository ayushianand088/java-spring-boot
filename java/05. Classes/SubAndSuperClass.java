// Super class
class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}

// subclass
class Dog extends Animal {
    void bark(){
        System.out.println("Dog is barking");
    }
}

class MyClass{
    void showMessage(){
        System.out.println("");
    }
}

public class SubAndSuperClass {
    public static void main(String[] args) {
        // Animal -> superclass, Dog -> subclass
        Animal a = new Dog();
        // Object -> superclass(implicitly as no superclass is there for Myclass), MyClass -> subclass of Object
        Object obj = new MyClass();

        a.eat();
        System.out.println(obj.getClass());

    }
}
