public class GenericMethod {
    public <T> void printName(T name){
        System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
        GenericMethod obj = new GenericMethod();
        obj.printName("Ayushi"); // T is String
        obj.printName(0); // T is Integer
    }
}
