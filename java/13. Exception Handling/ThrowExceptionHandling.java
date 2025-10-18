public class ThrowExceptionHandling {
    static void checkAge(int age) {
        if (age < 18) {
            // throw new exception
            throw new ArithmeticException("Age must be 18+");
        }
    }

    public static void main(String[] args) {
        try{
            checkAge(15);
        } catch(ArithmeticException e){
            System.out.println("Caught: " + e.getMessage());
            // re-throwing the same exception
            throw e;
        }
    }
}
