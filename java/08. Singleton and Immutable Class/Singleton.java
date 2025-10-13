public class Singleton {
    public static void main(String[] args) {
        EagerInitialization obj = EagerInitialization.getInstance();

        LazyInitialization obj1 = LazyInitialization.getInstance();

        SynchronizedMethod obj2 = SynchronizedMethod.getInstance();

        DoubleCheckedLocking obj3 = DoubleCheckedLocking.getInstance();

        BillPughSolution obj4 = BillPughSolution.getInstance();

        ENUMSingleton obj5 = ENUMSingleton.INSTANCE;
        obj5.show();
    }
}
