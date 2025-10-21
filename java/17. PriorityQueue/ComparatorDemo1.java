import java.util.Arrays;
import java.util.Comparator;

class Student{
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
}

class StudentIdComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.id - s2.id;
    }
}

public class ComparatorDemo1 {
    public static void main(String[] args) {
        Student[] students = {
            new Student(2, "Ayushi"),
            new Student(1, "Anisha"),
            new Student(3, "Anubhav")
        };

        Arrays.sort(students, new StudentIdComparator());

        // Arrays.sort(students, (s1,s2) -> s1.id - s2.id);

        for(Student s: students){
            System.out.println(s.id + "-" + s.name);
        }
    }
}
