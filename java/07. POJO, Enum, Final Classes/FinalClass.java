// final class can not be inherited
final class Animal{
    void sound(){
        System.out.println("Animal Sound");
    }
}

// class Dog extends Animal{} <-- compilation error

public class FinalClass {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
    }
}
