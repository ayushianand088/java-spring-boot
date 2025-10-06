interface Engine {
    void start();
}

interface MusicSystem {
    void playMusic();
}

class Car implements Engine, MusicSystem {
    public void start() {
        System.out.println("Car engine started...");
    }
    public void playMusic() {
        System.out.println("Music is playing...");
    }
}

public class MultipleInheritance {
    public static void main(String[] args){
        Car myCar = new Car();

        myCar.start();
        myCar.playMusic();
    }
}
