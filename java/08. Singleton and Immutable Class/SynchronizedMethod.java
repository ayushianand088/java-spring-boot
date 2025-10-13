class SynchronizedMethod{

    private static SynchronizedMethod instance;

    private SynchronizedMethod(){}

    synchronized public static SynchronizedMethod getInstance(){
        if(instance == null){
            instance = new SynchronizedMethod();
        }
        System.out.println("Object created by Synchronized method");
        return instance;
    }
}