class Teacher {
    Teacher() {
        System.out.println("Teacher constructor called");
    }
}

class Student extends Teacher {
    Student() {
        // calls other constructor in same class
        this("Ayushi");
        System.out.println("no argument Student constructor called");
    }
    Student(String name){
        // calls parent constructor
        super();
        System.out.println("Student constructor called with name: " + name);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Student s = new Student();
    }
}
