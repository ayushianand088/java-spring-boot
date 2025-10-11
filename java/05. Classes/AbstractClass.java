// abstract class
abstract class Car{
    int mileage;
    Car(int mileage){
        this.mileage = mileage;
    }

    // abstract method
    public abstract void pressBreak();
    public abstract void pressClutch();

    // non abstract method
    public int getWheels(){
        return 4;
    }
}

// another abstract class inheriting above abstract class
abstract class LuxuryCar extends Car{
    LuxuryCar(int mileage){
        super(mileage);
    }
    // additional abstract method
    public abstract void pressDualBreakSystem();

    @Override
    public void pressBreak(){
        // implementation
    }
}

// non abstract class
class Audi extends LuxuryCar{
    Audi(int mileage){
        super(mileage);
    }

    @Override
    public void pressClutch(){
        // implementation
    }

    @Override
    public void pressDualBreakSystem(){
        // implementation
    }
}

public class AbstractClass{
    public static void main(String[] args) {
        // abstract class object can not be created directly
        Audi a = new Audi(60);
    }
}