class Print<T> {
    T value;
    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }
}

// Non-generic subclass fixes type as Super class as String
class ColorPrint extends Print<String>{}

public class NonGenericSubClass {
    public static void main(String[] args) {
        ColorPrint colorPrintObj = new ColorPrint();
        colorPrintObj.setValue("2");
        System.out.println(colorPrintObj.getValue());
    }
}
