// interface defines abstract behavior
interface Car{
    void applyBrake();
}

// Implementation
class Honda implements Car{
    // internal implementation is hidden from user
    private void step1(){
        System.out.println("Step 1: Reduce engine power");
    }
    private void step2(){
        System.out.println("Step 2: Car slows down");
    }

    // applyBrake() uses internal steps
    public void applyBrake(){
        step1();
        step2();
        System.out.println("Car is stopped");
    }
}

public class AbstractionDemo {
    public static void main(String[] args){
        // user only sees car interface
        Car myCar = new Honda();
        // user calls applyBrake()
        myCar.applyBrake();
        // user can't access internal steps directly
        // myCar.step1();
    }
}