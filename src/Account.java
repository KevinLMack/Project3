
public class Account {
    private double Balance;
    private int Accountnumber;
    private static int NumberOfAccounts =  1000;

    public Account(double Initial){
        this.Balance = Initial;
        this.Accountnumber = ++NumberOfAccounts;
    }
    public void Deposit(double Amount){
        Balance += Amount;
        System.out.println("Amount deposited: "+ Amount);
        System.out.println("Updated balance: " + Balance);
    }
    public void Withdrawl(double Amount){
        if(Amount> Balance){
            System.out.println("Not enough funds");
        }else {
            Balance -= Amount;
            System.out.println("Amount withdrawn: "+ Amount);
            System.out.println("Updated Balance: " + Balance);
        }
    }
    public double getBalance(){
        return Balance;
    }
    public int getAccountnumber(){
        return Accountnumber;
    }
    public static int getNumberOfAccounts(){
        return NumberOfAccounts;
    }
    @Override
    public String toString(){
        return "Account Number: " + Accountnumber + ", Balance: " +Balance;
    }
}
