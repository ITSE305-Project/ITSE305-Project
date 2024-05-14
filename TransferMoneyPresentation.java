import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class represents the presentation layer of the Funds Transfer System.
 * It handles user input and interaction for transferring money between accounts.
 */
public class TransferMoneyPresentation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Welcome to Funds Transfer System");
            System.out.print("Enter your account IBAN: ");
            String senderAccount = scanner.nextLine();

            System.out.print("Enter recipient's account IBAN: ");
            String recipientAccount = scanner.nextLine();

            System.out.print("Enter transfer amount: ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Consume newline left from nextDouble

            if (amount <= 0) {
                throw new IllegalArgumentException("Transfer amount must be positive.");
            }

            System.out.print("Enter transaction description: ");
            String description = scanner.nextLine();

            // Create business layer object and initiate funds transfer
            TransferMoneyData data = new TransferMoneyData();
            TransferMoneyBusiness transferSystem = new TransferMoneyBusiness(data);
            transferSystem.transferFunds(senderAccount, recipientAccount, amount, description);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input format. Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
