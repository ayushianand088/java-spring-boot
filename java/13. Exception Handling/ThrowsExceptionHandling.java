public class ThrowsExceptionHandling {
    static void demo() throws ArithmeticException{
        int result = 10/0;
        System.out.println(result);
    }
    public static void main(String[] args){
        try {
            demo();
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: " + e);
        }
    }
}
