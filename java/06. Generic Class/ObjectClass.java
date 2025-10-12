class Print{
    Object value;

    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }
}

public class ObjectClass {
    public static void main(String[] args){
        Print printObj = new Print();
        printObj.setValue(1);
        Object printValue = printObj.getValue();

        /* Problem with Object Class: we have to typecast the value before use, as Object can be anything like String, Integer
        */
        if((int)printValue == 1){}
    }
}