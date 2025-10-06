class Vehicle {
    void engine(){
        System.out.println("Engine started");
    }
}

class Car extends Vehicle {
    void wheels() {
        System.out.println("Car has 4 wheels");
    }
}

class ElectricCar extends Car {
    void charge() {
        System.out.println("Charging electric car");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args){
        ElectricCar tesla = new ElectricCar();

        // from Vechile class
        tesla.engine();
        // from Car class
        tesla.wheels();
        // from ElectricCar
        tesla.charge();
    }
}
