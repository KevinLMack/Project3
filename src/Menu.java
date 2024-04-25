import  java.util.Scanner;
public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private Bank bank = new Bank();

    public void displayMenu() {
        while (true) {
            System.out.println("****MENU****");
            System.out.println("1. Access an account");
            System.out.println("2. Open a new account");
            System.out.println("3. Close all accounts");
            System.out.println("4. Exit");


            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                accessAccount();
            } else if (option == 2) {
                openNewAccount();
            } else if (option == 3) {
                closeAll();
            } else if (option == 4) {
                System.out.println("thank you for using BSU banking app");
                return;
            } else {
                System.out.println("Invalid entry");
            }
        }
    }

    private void accessAccount() {
        System.out.println("Enter Customer Pin: ");
        int pin = scanner.nextInt();
        scanner.nextLine();
        Customer customer = bank.getCustomerbyPin(pin);
        if (customer == null) {
            System.out.println("PIN is not valid");
            return;
        }
            System.out.println("Customer: " + customer);
            System.out.println("Customer's accounts: ");
            System.out.println(customer.getAllAccountsInfo());
            System.out.println("enter account number: ");
            int accountNumber = scanner.nextInt();


            Account account = customer.getAccountByNumber(accountNumber);
            if (account == null) {
                System.out.println("Account number invaild");
                return;
            }
            displayAcccountMenu(account,customer);

        //displayAcccountMenu(account,customer);
    }

    private void openNewAccount() {
        System.out.println("are you a new customer? (yes/no):");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            Customer newCustomer = createCustomer();
            if (newCustomer == null) {
                return;
            }
            System.out.println("enter intial deposit amount: ");
            double Initial = scanner.nextDouble();

            Account NewAccount = new Account(Initial);
            newCustomer.addAccount(NewAccount);
            System.out.println("new account has been opened: " + NewAccount.getAccountnumber());
        } else if (answer.equalsIgnoreCase("no"))
        {
            System.out.println("enter your PIN");
            int pin = scanner.nextInt();

            Customer existingCustomer = bank.getCustomerbyPin(pin);
            if (existingCustomer == null) {
                System.out.println("PIN is not valid");
                return;
            }
            System.out.println("Enter initial deposit amount: ");
            double Initial = scanner.nextDouble();

            Account NewAccount = new Account(Initial);
            existingCustomer.addAccount(NewAccount);
            System.out.println("New Account opened: " + NewAccount.getAccountnumber());
        } else {
            System.out.println("invalid response. try again");
        }
    }
    private Customer createCustomer() {
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter PIN (4 digits): ");
        int pin = scanner.nextInt();


        Customer newCustomer = new Customer(firstName, lastName, pin);
        bank.addCustomer(newCustomer);

        return newCustomer;
    }
        private void closeAll(){
            System.out.println("Enter PIN");
            int pin = scanner.nextInt();

            Customer customer = bank.getCustomerbyPin(pin);
            if(customer==null){
                System.out.println("Pin is not valid");
                return;
            }
            bank.removeCustomer(customer);
            System.out.println("Customer has been removed.");
        }
        private void displayAcccountMenu(Account account,Customer customer){
        while(true){
            System.out.println("****Make A Selection****");
            System.out.println("1. make a deposit");
            System.out.println("2. make a withdrawl");
            System.out.println("3. see account balance");
            System.out.println("4. close account");
            System.out.println("5. Exit");

            int options = scanner.nextInt();
            scanner.nextLine();
            if (options == 1) {
                System.out.println("enter deposit amount: ");
                double depositAmount = scanner.nextDouble();
                account.Deposit(depositAmount);
            } else if (options == 2) {
                System.out.println("enter withdrawl amount: ");
                double withdrawlAmount = scanner.nextDouble();
                account.Withdrawl(withdrawlAmount);
            } else if (options == 3) {
                System.out.println("current balance: " + account.getBalance());
            } else if (options == 4) {
                System.out.println("closing account");
                customer.removeAccount(account);
            } else if(options ==5 ){
                System.out.println("back to main menu");
                return;
            }else{
                System.out.println("invalid number try again");
            }
        }
        }

        }

