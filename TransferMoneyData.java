/**
 * A class to manage accounts and their information.
 */
class Account {
    private String IBAN;
    private double balance;

    public Account(String IBAN, double balance) {
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
    private Account[] accounts;

    public TransferMoneyData() {
        accounts = new Account[3];
        accounts[0] = new Account("123123123", 2000.0);
        accounts[1] = new Account("112233123", 3000.0);
        accounts[2] = new Account("123456789", 1000.0);
    }

    public boolean accountExists(String IBAN) {
        return getAccount(IBAN) != null;
    }

    public Account getAccount(String IBAN) {
        for (Account acc : accounts) {
            if (acc.getIBAN().equals(IBAN)) {
                return acc;
            }
        }
        return null; // Account not found
    }
}