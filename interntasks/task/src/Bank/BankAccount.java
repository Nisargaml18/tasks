package Bank;
import java.util.ArrayList;
import java.util.Scanner;
public class BankAccount {

	private double balance;
    private ArrayList<String> transactionHistory;

    public BankAccount() {
        balance = 0;
        transactionHistory = new ArrayList<>();
    }

    public void showTransactionHistory() {
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String transaction : transactionHistory) {
                System.out.println(transaction);
            }
        }
    }

    public void withdraw(Scanner scanner) {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            transactionHistory.add("Withdraw: $" + amount);
            System.out.println("Withdraw successful. Current balance: $" + balance);
        }
    }

    public void deposit(Scanner scanner) {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        balance += amount;
        transactionHistory.add("Deposit: $" + amount);
        System.out.println("Deposit successful. Current balance: $" + balance);
    }

    public void transfer(Scanner scanner) {
        System.out.print("Enter amount to transfer: ");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            transactionHistory.add("Transfer: $" + amount);
            System.out.println("Transfer successful. Current balance: $" + balance);
        }
    }

}
