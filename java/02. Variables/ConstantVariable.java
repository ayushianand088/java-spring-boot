class ConstantDemo {
    final int var1 = 10; // instance constant, each object has its own copy
    static final int var2 = 20; // class constant, shared by all objects
}

public class ConstantVariable {
    public static void main(String[] args) {
        ConstantDemo c1 = new ConstantDemo();
        ConstantDemo c2 = new ConstantDemo();

        System.out.println(c1.var1);
        System.out.println(c2.var1);

        System.out.println(ConstantDemo.var2);
    }
}
