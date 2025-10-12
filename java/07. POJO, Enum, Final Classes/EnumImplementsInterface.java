interface Printable{
    void print();
}
public enum EnumImplementsInterface implements Printable {
    RED, BLUE, GREEN;

    public void print(){
        System.out.println(this);
    }
}
