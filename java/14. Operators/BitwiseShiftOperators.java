public class BitwiseShiftOperators {
    public static void main(String[] args) {
        int num = -4;

        System.out.println("num is  "+ num);

        // left shift
        System.out.println("num << 1 => " + (num << 1));
        System.out.println("num << 2 => " + (num << 2));

        // right shift
        System.out.println("num >> 1 => " + (num >> 1));
        System.out.println("num >> 2 => " + (num >> 2));

        // unsigned right shift
        System.out.println("num >>> 1 => " + (num >>> 1));
        System.out.println("num >>> 2 => " + (num >>> 2));

    }
}
