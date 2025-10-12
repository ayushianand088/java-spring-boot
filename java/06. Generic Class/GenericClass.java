class Print<P>{
    P value;

    public P getValue(){
        return value;
    }

    public void setValue(P value){
        this.value = value;
    }
}

public class GenericClass {
    public static void main(String[] args) {
        // <P> can be any non primitive
        Print<Integer> printObj = new Print<Integer>();
        printObj.setValue(1);
        Integer printValue = printObj.getValue();

        // As we now type is Integer, so no need to typecast 
        if(printValue == 1){}
    }
}
