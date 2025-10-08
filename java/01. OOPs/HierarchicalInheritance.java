class Vehicle {
    void engine(){
        System.out.println("Engine started...");
    }
}

class Car extends Vehicle {
    String type = "Thar";
    void getType() {
        System.out.println("Car: Thar");
    }
}

class Bike extends Vehicle {
    String type = "Bullet";
    void getType() {
        System.out.println("Bike: Bullet");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args){
        Car myCar = new Car();
        Bike myBike = new Bike();

        myCar.engine();
        myBike.engine();

        myCar.getType();
        myBike.getType();
    }
}
