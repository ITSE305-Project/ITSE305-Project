/**
 * This class represents the business logic layer of the Funds Transfer System.
 * It contains methods for transferring funds and authenticating transactions.
 */
class TransferMoneyBusiness {
    private TransferMoneyData data;

    public TransferMoneyBusiness(TransferMoneyData data) {
        this.data = data;
    }

    public void transferFunds(String senderIBAN, String recipientIBAN, double amount, String description) {
        // Authenticate sender, recipient, and transaction amount
        Account sender = data.getAccount(senderIBAN);
        Account recipient = data.getAccount(recipientIBAN);

        // Process funds transfer
        if (sender != null && recipient != null && sender.getBalance() >= amount) {
            System.out.println("Transaction authenticated. Processing funds transfer...");
            sender.setBalance(sender.getBalance() - amount); // Making balance changes
            recipient.setBalance(recipient.getBalance() + amount);
            System.out.println("Transfer Details:");
            System.out.println("Sender Account: " + senderIBAN);
            System.out.println("Recipient Account: " + recipientIBAN);
            System.out.println("Amount: " + amount);
            System.out.println("Your Balance: " + sender.getBalance());
            System.out.println("Description: " + description);
            System.out.println("Transfer Successful!");
            // Transfer successful
        } else {
            System.out.println("Transaction authentication failed. Unable to process transfer.");
            // Transfer failed
        }
    }
}
