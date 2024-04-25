import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Menu menu = new Menu();
        menu.displayMenu();
    }
    private void openNewAccount() {
        System.out.println("select account type:");
        System.out.println("1.regular account:");
        System.out.println("2.saving account");
        Scanner scanner = new Scanner(System.in);
        int accountType = scanner.nextInt();
        scanner.nextLine();
        if (accountType == 1) {
        } else if (accountType == 2) {
            System.out.println("Are you a new customer? (yes/no)");
        } else {
            System.out.println("invalid option");
        }
    }
    }
