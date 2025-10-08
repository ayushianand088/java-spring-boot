package package2;

import package1.College;

public class Student {
    public static void main(String[] args){
        College c = new College();
        System.out.println("Only public method is accessible in different package :");
        c.publicMethod();
        // c.protectedMethod();
        // c.defaultMethod();
        // c.privateMethod();
    }
}