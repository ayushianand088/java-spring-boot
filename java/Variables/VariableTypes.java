public class VariableTypes {
    
    // member variable
    int memberVariable;
    // static variable or class variable
    static int staticVariable = 10;

    // default constructor
    VariableTypes(){}

    // parameterized constructor
    VariableTypes(int num){}

    public void dummyMethod1(){
        // local variable
        byte localVariable = 100;
        System.out.println(localVariable);
    }

    // method parameter
    public int dummyMethod2(int num1, int num2){
        return num1 + num2;
    }

    public static void main(String[] args){
        VariableTypes obj1 = new VariableTypes();
        VariableTypes obj2 = new VariableTypes();

        // static variable is having only 1 copy and accessible using class name
        System.out.println("Static variable: " + VariableTypes.staticVariable);

        // each object is having their own copy of member variable
        System.out.println("Member variable: "+ obj1.memberVariable);

        obj1.dummyMethod2(2,5);
    }
}