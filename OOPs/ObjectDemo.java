class Student{
    // properties
    String name;
    int age;
    int rollNumber;

    // Behaviors
    void study(){
        System.out.println(name + " is Studying");
    }
    void giveExam(){
        System.out.println(name + " is giving exam");
    }
    void attendClass(){
        System.out.println(name + " is attending class");
    }
}

public class ObjectDemo {
    public static void main(String[] args){
        // object of Student
        Student s1 = new Student();

        s1.name = "Ayushi";
        s1.age = 21;
        s1.rollNumber = 1;

        s1.study();
        // s1.giveExam();
        // s1.attendClass();
    }
}