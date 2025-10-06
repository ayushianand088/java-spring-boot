// Parent class
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Child class inheriting Vehicle
class Car extends Vehicle {
    void playMusic() {
        System.out.println("Music is playing...");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Car myCar = new Car();

        // Child can access both parent and its own methods
        myCar.start();      // from Vehicle class
        myCar.playMusic();  // from Car class
    }
}
