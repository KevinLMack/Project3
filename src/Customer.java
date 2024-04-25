import java.util.ArrayList;

public class Customer {
    private String First;
    private String Last;
    private int pin;
    private ArrayList<Account>accounts;
    private ArrayList<SavingsAccount>savingsAccounts;

    public Customer(String First, String Last, int pin){
        this.First=First;
        this.Last=Last;
        this.pin=pin;
        this.accounts=new ArrayList<>();
        this.savingsAccounts = new ArrayList<>();
    }
    public void addSavingAccount(SavingsAccount savingsAccount){
        savingsAccount.add(savingsAccount);
    }
    public void removeSavingsAccount(SavingsAccount savingsAccount) {
        savingsAccounts.remove(savingsAccount);
    }

    public SavingsAccount getSavingsAccountByNumber(int accountNumber) {
        for (SavingsAccount savingsAccount : savingsAccounts) {
            if (savingsAccount.getAccountnumber() == accountNumber) {
                return savingsAccount;
            }
        }
        return null;
    }

    public String getAllSavingsAccountsInfo() {
        StringBuilder info = new StringBuilder();
        for (SavingsAccount savingsAccount : savingsAccounts) {
            info.append(savingsAccount.toString()).append("\n");
        }
        return info.toString();
    }
    public void addAccount(Account account){
        accounts.add(account);
    }
    public void removeAccount(Account account) {
        accounts.remove(account);
    }
    public Account getAccountByNumber(int Accountnumber){
        for(Account account: accounts){
            if(account.getAccountnumber() == Accountnumber){
                return account;
            }
        }
        return null;
    }
    public String getAllAccountsInfo(){
        StringBuilder Info = new StringBuilder();
        for(Account account: accounts){
            Info.append(account.toString()).append("\n");
            }
        return Info.toString();
    }
    public String getFirst(){
        return First;
    }
    public void setFirst(String First){
        this.First = First;
    }
    public String getLast(){
        return Last;
    }
    public void setLast(String Last){
        this.Last = Last;
    }
    public int getPin(){
        return pin;
    }
    public void setPin(int pin){
        this.pin = pin;
    }
    @Override
    public String toString(){
        return "Name: " + First + "" + Last + ", PIN: "+pin;
    }
}
