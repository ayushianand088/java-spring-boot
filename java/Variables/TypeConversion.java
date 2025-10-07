public class TypeConversion {
    public static void main(String[] args){
        int num = 40;

        // Automatic Conversion (int to long)
        long numLong = num;
        System.out.println("numLong = " + numLong);

        // Explicit Conversion (int to byte)
        byte numByte = (byte)num;
        System.out.println("numByte: " + numByte);

        // Pormotion during expression
        byte num1 = 1;
        byte num2 = 127;
        // byte sum = num1 + num2; <-- won't work sience range is crossing
        int sum = num1 + num2;
        byte sumInByte = (byte)(num1 + num2);
        System.out.println("Sum is " + sum);
        System.out.println("Sum in byte is " + sumInByte);
    }
}
