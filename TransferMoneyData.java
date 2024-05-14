/**
 * A class to manage accounts and their information.
 */
class TransferAccount {
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

/**
 * A class to manage account data and operations.
 */
public class TransferMoneyData {
    private TransferAccount[] accounts;

    public TransferMoneyData() {
        accounts = new TransferAccount[3];
        accounts[0] = new TransferAccount("123123123", 2000.0);
        accounts[1] = new TransferAccount("112233123", 3000.0);
        accounts[2] = new TransferAccount("123456789", 1000.0);
    }

    public boolean accountExists(String IBAN) {
        return getAccount(IBAN) != null;
    }

    public TransferAccount getAccount(String IBAN) {
        for (TransferAccount acc : accounts) {
            if (acc.getIBAN().equals(IBAN)) {
                return acc;
            }
        }
        return null; // Account not found
    }
}
