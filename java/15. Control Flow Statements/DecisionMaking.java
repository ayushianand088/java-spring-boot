public class DecisionMaking{
    public static void main(String[] args) {
        int age = 22;

        System.out.println("Age is " + age);

        // If then
        if(age > 18){
            System.out.println("You are adult");
        }

        // If-else
        if(age > 18){
            System.out.println("You are adult");
        } else{
            System.out.println("You are minor");
        }

        // If-else-If Ladder
        if(age < 0){
            System.out.println("Incorrect Age provided");
        } else if(age < 18){
            System.out.println("You are a child");
        } else if(age < 60) {
            System.out.println("You are young");
        } else{
            System.out.println("You are old");
        }

        // Nested if
        if(age > 0){
            if(age < 18) {
                System.out.println("You are child");
            } else {
                System.out.println("You are an adult");
            }
        } else {
            System.out.println("Invalid age");
        }

        int num1 = 1;
        int num2 = 2;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // switch statement
        switch (num1 + num2) {
            case 1:
                System.out.println("num1 + num2 =  " + 1);
                break;
            case 2:
                System.out.println("num1 + num2 =  " + 2);
                break;
            case 3:
                System.out.println("num1 + num2 =  " + 3);
                break;
            default:
                System.out.println("num1 + num2 =  " + (num1+num2));
        }

        // switch expression
        int score = 1;
        String result1 = switch(score){
            case 1 -> "Correct";
            case 0 -> "Incorrect";
            default -> "None";
        };
        System.out.println(result1);
        String result2 = switch(score){
            case 1 -> {
                yield "Correct";
            }
            case 0 -> {
                yield "Incorrect";
            }
            default -> {
                yield "None";
            }
        };
        System.out.println(result2);
    }
}