class CustomException extends ArithmeticException{
    CustomException(String message){
        // passes message to ArithmeticException
        super(message);
    }
}

public class UserDefinedException {
    static void divide(int num1, int num2){
        if(num2 == 0) throw new CustomException("Cannot divide by zero");
        System.out.println(num1/num2);
    }
    public static void main(String[] args) {
        // triggers CustomException
        divide(10, 0);
    }
}