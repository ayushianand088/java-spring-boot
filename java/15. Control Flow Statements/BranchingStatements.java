public class BranchingStatements {
    public static void main(String[] args) {

        System.out.println("Using break:");
        for(int i = 1; i <= 5; i++){
            if(i == 3){
                // break statement
                break;
            }
            System.out.println(i);
        }

        System.out.println("Using continue:");
        for(int i = 1; i <= 5; i++){
            if(i == 3){
                // continue statement
                continue;
            }
            System.out.println(i);
        }
    }
}
