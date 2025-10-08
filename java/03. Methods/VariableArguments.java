public class VariableArguments {
    // Variable arguments(number of arguments not fixed)
    public int sum(int ...variable){
        int output = 0;
        for(int var: variable){
            output += var;
        }
        System.out.println("Sum is " + output);
        return output;
    }

    public static void main(String[] args){
        VariableArguments va = new VariableArguments();
        va.sum(3,2);
        va.sum(5,7,10);
    }
}
