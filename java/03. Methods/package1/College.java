package package1;

public class College {
    public void publicMethod(){
        System.out.println("Public Method");
    }
    protected void protectedMethod(){
        System.out.println("Protected Method");
    }
    void defaultMethod(){
        System.out.println("Default Method");
    }
    private void privateMethod(){
        System.out.println("Private Method");
    }

    public static void main(String[] args) {
        College c = new College();
        System.out.println("All Method is accessible in same class :");
        c.publicMethod();
        c.protectedMethod();
        c.defaultMethod();
        c.privateMethod();
    }
}