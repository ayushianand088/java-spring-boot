class Person{
    int age;
    Person(int age){
        this.age = age;
    }
    public int age(){
        return age;
    }
}

public class ConcreteClass {
    public static void main(String[] args) {
        Person p = new Person(21);
        System.out.println("Age is " + p.age);
    }
}
