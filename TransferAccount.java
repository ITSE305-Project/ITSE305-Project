/**
 * A class to manage accounts and their information.
 */
public class TransferAccount {
    private String IBAN;
    private double balance;

    public TransferAccount(String IBAN, double balance) {
        if (IBAN == null || IBAN.isEmpty()) {
            throw new IllegalArgumentException("IBAN cannot be null or empty.");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative.");
        }

        this.IBAN = IBAN;
        this.balance = balance;
    }

    public String getIBAN() {
        return IBAN;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

