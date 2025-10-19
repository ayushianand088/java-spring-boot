import java.util.Arrays;

public class IterativeStatements {
    public static void main(String[] args) {

        System.out.println("Table of 2:");
        // for loop
        for(int i=1; i<=10;i++){
            System.out.println(2 + " x " + i + " = " + (2*i));
        }

        System.out.println("Table of 3: ");
        // while loop
        int i = 1;
        while (i <= 10) {
            System.out.println(3 + " x " + i + " = " + (3*i));
            i++;
        }

        System.out.println("Table of 4: ");
        // do while loop
        i = 1;
        do{
            System.out.println(4 + " x " + i + " = " + (4*i));
            i++;
        } while(i <= 10);

        // for each loop
        int[] numbers = {1,2,3,4,5,6};
        System.out.println("Array is " + Arrays.toString(numbers));
        System.out.println("Even values in array");
        for(int num: numbers){
            if(num%2 == 0){
                System.out.println(num);
            }
        }
    }
}
