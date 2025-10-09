class Person{
    String name;

    Person(){
        name = "Unknown";
    }
}

public class NoArgumentConstructor {
    public static void main(String[] args){
         // No Argument constructor is called
        Person p = new Person();
        System.out.println(p.name);
    }
}