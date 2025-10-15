// ways to get any class Class object

class Class1{}
class Class2{}
class Class3{}

public class GetClassObject {
    public static void main(String[] args) throws ClassNotFoundException {
        // way 1: Using forName() method
        Class class1Class = Class.forName("Class1");

        // way 2: Using .class
        Class class2Class = Class2.class;

        // way 3: using getClass() method
        Class3 class3Obj = new Class3();
        Class class3Class = class3Obj.getClass();
    }
}
