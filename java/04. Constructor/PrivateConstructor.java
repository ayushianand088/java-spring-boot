class Demo {
    private Demo(){
        System.out.println("Private Constructor called");
    }
    public static void showMessage(){
        System.out.println("Accessing class functionality without creating object");
    }
    public void showMessage2(){
        System.out.println("Accessing Non static method ");
    }
    public static Demo createObject() {
         return new Demo();
    }
}

public class PrivateConstructor {
    public static void main(String[] args) {
        // constructor is private, its object can not be created
        // Demo obj = new Demo();
        Demo.showMessage();
        // non static method cannot be accessed using class name
        // Demo.showMessage2();

        // indirect object creation
        Demo obj1 = Demo.createObject();
    }
}
