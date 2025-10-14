class Bird {
    // can have any access modifier
    protected interface NonFlyingBird{
        public void canSwim();
    }
}

class Penguin implements Bird.NonFlyingBird{
    public void canSwim(){
        System.out.println("Penguin can swim");
    }
}

public class NestedInterfaceWithinClass {
    public static void main(String[] args) {
        Penguin obj = new Penguin();
        obj.canSwim();
    }
}
