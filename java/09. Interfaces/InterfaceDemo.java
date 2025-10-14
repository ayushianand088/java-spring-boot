interface Bird {
    void fly();
}
interface LivingThings {
    void eat();
}

interface Organism extends Bird, LivingThings{}

public class InterfaceDemo{
    public static void main(String[] args){}
}