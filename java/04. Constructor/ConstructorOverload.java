class Calculate {
    int result;
    Calculate(int num1, int num2){
        result = num1 + num2;
    }
    Calculate(int num1, int num2, int num3){
        result = num1 + num2 + num3;
    }
    Calculate(int num1, int num2, int num3, int num4){
        result = num1 + num2 + num3 + num4;
    }
}

public class ConstructorOverload {
    public static void main(String[] args) {
        // Constructor Overloading
        Calculate c1 = new Calculate(10, 12);
        Calculate c2 = new Calculate(4, 10,13);
        Calculate c3 = new Calculate(4, 0,17,3);
        System.out.println(c1.result);
        System.out.println(c2.result);
        System.out.println(c3.result);
    }
}
