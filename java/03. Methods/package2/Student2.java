package package2;

import package1.College;

public class Student2 extends College {
    public static void main(String[] args) {
        Student2 s = new Student2();
        System.out.println("Only public and protected method is accessible in different package through subclass :");
        s.publicMethod();
        s.protectedMethod();
        // s.defaultMethod();
        // s.privateMethod();
    }
}
