public class AssignmentOperators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        System.out.println("num1 value is " + num1);
        System.out.println("num2 value is " + num2);

        num1 += num2;
        System.out.println("num1 += num2 => num1 = num1 + num2 => num1 = " + num1);

        num1 -= num2;
        System.out.println("num1 -= num2 => num1 = num1 - num2 => num1 = " + num1);

        num1 *= num2;
        System.out.println("num1 *= num2 => num1 = num1 * num2 => num1 = " + num1);

        num1 /= num2;
        System.out.println("num1 /= num2 => num1 = num1 / num2 => num1 = " + num1);

        num1 %= num2;
        System.out.println("num1 %= num2 => num1 = num1 % num2 => num1 = " + num1);
    }
}
