public class UnaryOperator {
    public static void main(String[] args) {
        int num = 5;
        boolean flag = true;

        System.out.println("Num value is  " + num);
        System.out.println("flag is " + flag);

        // Increment Operator
        System.out.println("num++: " + (num++));
        num = 5;
        System.out.println("++num: " + (++num));

        // Decrement Operator
        num = 5;
        System.out.println("num--: " + (num--));
        num = 5;
        System.out.println("--num: " + (--num));

        // Logical NOT Operator
        System.out.println("!flag: " + (!flag));

        // Unary minus operator
        num = 5;
        System.out.println("-num:  "+ (-num));

        // Unary plus operator
        num = 5;
        System.out.println("+num:  "+ (+num));
    }
}
