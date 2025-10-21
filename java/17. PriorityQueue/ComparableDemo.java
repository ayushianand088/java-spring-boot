import java.util.Arrays;

class Student implements Comparable<Student>{
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    // compare based on id
    public int compareTo(Student s){
        // ascending order
        return this.id - s.id;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        Student[] students = {
            new Student(2, "Ayushi"),
            new Student(1, "Anisha"),
            new Student(3, "Anubhav")
        };

        Arrays.sort(students);

        for(Student s: students){
            System.out.println(s.id + "-" + s.name);
        }
    }
}
