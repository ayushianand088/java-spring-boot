// Non primitve data types: class, string, interface, array
interface Person {
    void work();
}

class Engineer implements Person {
    public void work() {
        System.out.println("Coding...");
    }
}

class Teacher implements Person {
    public void work() {
        System.out.println("Teaching...");
    }
}

public class NonPrimitiveDataType {

    public static void main(String[] args) {

        Person p1 = new Engineer(); // Interface reference → Engineer object
        Person p2 = new Teacher(); // Interface reference → Teacher object
        p1.work();
        p2.work();

        Engineer e1 = new Engineer(); // Class reference → Engineer object
        Teacher t1 = new Teacher(); // Class reference → Teacher object
        e1.work();
        t1.work();

        // s1, s2 reference to same location "hello"
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        // == checks whether they point to same memory location or not
        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s2 == s3: " + (s2 == s3));
        System.out.println("s1 is equals s2: " + s1.equals(s2));
        System.out.println("s2 is equals s3: " + s2.equals(s3));

        // arr and arr2 reference is same
        int[] arr = {5, 6, 7, 9};
        int[] arr2 = arr;
        arr2[1] = 10;
        System.out.println(arr[1]);
    }
}