
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