class EagerInitialization{

    private static final EagerInitialization instance = new EagerInitialization();

    private EagerInitialization(){}

    public static EagerInitialization getInstance(){
        System.out.println("Object created by Eager Initilization");
        return instance;
    }
}