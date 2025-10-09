class Person {
    String name;

    Person(String n){
        name = n;
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        // Parameterized Constructor is called
        Person p = new Person("Ayushi");
        System.out.println(p.name);
    }
}
