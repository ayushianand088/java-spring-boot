class Sum {
    // Method Overloading
    int doSum(int a, int b){
        return a + b;
    }
    int doSum(int a, int b, int c){
        return a + b + c;
    }
}

public class StaticPolymorphism {
    public static void main(String[] args){
        Sum s1 = new Sum();
        int n1 = 10;
        int n2 = 15;
        int n3 = 5;
        System.out.println(n1 + " + " + n2 + " = " + s1.doSum(n1, n2));
        System.out.println(n1 + " + " + n2 + " + " + n3 + " = " + s1.doSum(n1, n2,n3));
    }
}