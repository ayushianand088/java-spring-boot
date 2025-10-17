public class CheckedException{
    public static void main(String[] args) {
        try {
            method1();
        } catch (ClassNotFoundException exceptionObj) {
            // handle exception
        }
    }

    public static void method1() throws ClassNotFoundException{
        throw new ClassNotFoundException();
    }
}