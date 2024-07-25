package Bank;
import java.util.Scanner;
public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        BankAccount account = new BankAccount();

	        while (true) {
	            System.out.println("1. Transaction History");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Deposit");
	            System.out.println("4. Transfer");
	            System.out.println("5. Quit");
	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    account.showTransactionHistory();
	                    break;
	                case 2:
	                    account.withdraw(scanner);
	                    break;
	                case 3:
	                    account.deposit(scanner);
	                    break;
	                case 4:
	                    account.transfer(scanner);
	                    break;
	                case 5:
	                    System.out.println("Thank you for using our ATM. Goodbye!");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	}

}
