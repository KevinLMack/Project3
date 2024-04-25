public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(double Initial, double interestRate) {
        super(Initial);
        this.interestRate = interestRate;
    }
    public void calculateInterest(){
        double interest = getBalance() * interestRate/100;
        Deposit(interest);
        System.out.println("Interest calculated and added to the account: " + interest);
    }

    public void add(SavingsAccount savingsAccount) {
    }
}
