interface Bird {
    void canFly();

    // implicitly public
    interface NonFlyingBird {
        void canSwim();
    }
}

class Crow implements Bird {
    public void canFly() {
        System.out.println("Crow can fly");
    }
}

class Penguin implements Bird.NonFlyingBird {
    public void canSwim() {
        System.out.println("Penguin can swim");
    }
}

class Duck implements Bird, Bird.NonFlyingBird {
    public void canFly() {
        System.out.println("Duck can fly");
    }
    public void canSwim() {
        System.out.println("Duck can swim");
    }
}

public class NestedInterface {
    public static void main(String[] args) {
        Bird birdObj = new Crow();
        Bird.NonFlyingBird nonFlyingBirdObj = new Penguin();
        Duck duck = new Duck();

        birdObj.canFly();
        nonFlyingBirdObj.canSwim();
        duck.canFly();
        duck.canSwim();
    }
}
