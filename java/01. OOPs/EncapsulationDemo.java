class BankAccount {
    // hidden data
    private double balance;

    public void deposit(double amt){
        if(amt > 0){
            balance += amt;
        }
    }
    public void withdraw(double amt){
        if(amt > 0 && amt <= balance){
            balance -= amt;
        }
    }
    public double getBalance(){
        return balance;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args){
        BankAccount acc = new BankAccount();
        acc.deposit(1000);
        acc.withdraw(300);
        System.out.println("Balance: "+ acc.getBalance());
    }
}
