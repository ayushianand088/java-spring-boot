package package1;

public class College2 {
    public static void main(String[] args){
        College c = new College();
        System.out.println("All Method is accessible in same class except private :");
        c.publicMethod();
        c.protectedMethod();
        c.defaultMethod();
        // c.privateMethod();
    }
}
