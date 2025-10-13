class LazyInitialization{

    private static LazyInitialization instance;

    private LazyInitialization(){}

    public static LazyInitialization getInstance(){
        if(instance == null){
            instance = new LazyInitialization();
        }
        System.out.println("Object created by Lazy Initilization");
        return instance;
    }
}