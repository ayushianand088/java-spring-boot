class ParentClass{}

class ChildClass1 extends ParentClass{}

class ChildClass2 extends ParentClass{}

public class TypeComparisonOperator {
    public static void main(String[] args) {
        ParentClass child1Obj = new ChildClass1();
        System.out.println(child1Obj instanceof ParentClass);
        System.out.println(child1Obj instanceof ChildClass1);
        System.out.println(child1Obj instanceof ChildClass2);

        String value = "hello";
        System.out.println(value instanceof String);
        System.out.println(value instanceof Object);
    }
}
