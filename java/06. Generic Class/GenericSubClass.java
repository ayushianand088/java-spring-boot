class Print<T>{
    T value;
    public T getPrintValue(){
        return value;
    }
    public void setPrintValue(T value){
        this.value = value;
    }
}

class ColorPrint<T> extends Print<T>{}

public class GenericSubClass {
    public static void main(String[] args) {
        ColorPrint<String> colorPrintObj = new ColorPrint<>();
        colorPrintObj.setPrintValue("2");
        System.out.println(colorPrintObj.getPrintValue());
    }
}