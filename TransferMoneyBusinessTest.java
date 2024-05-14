import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TransferMoneyBusinessTest {

    @Test
    void testTransferFunds_Successful() {
        TransferMoneyData data = new TransferMoneyData();
        TransferMoneyBusiness business = new TransferMoneyBusiness(data);

        String senderIBAN = "123123123";
        String recipientIBAN = "112233123";
        double amount = 500.0;
        String description = "Payment for services";

        business.transferFunds(senderIBAN, recipientIBAN, amount, description);

        // Verify balances after successful transfer
        TransferAccount sender = data.getAccount(senderIBAN);
        TransferAccount recipient = data.getAccount(recipientIBAN);
        assertEquals(1500.0, sender.getBalance());
        assertEquals(3500.0, recipient.getBalance());
    }

    @Test
    void testTransferFunds_Failed() {
        TransferMoneyData data = new TransferMoneyData();
        TransferMoneyBusiness business = new TransferMoneyBusiness(data);

        String senderIBAN = "123123123";
        String recipientIBAN = "112233123";
        double amount = 3000.0; // Exceeds sender's balance

        business.transferFunds(senderIBAN, recipientIBAN, amount, "Large transfer");

        // Verify balances remain unchanged
        TransferAccount sender = data.getAccount(senderIBAN);
        TransferAccount recipient = data.getAccount(recipientIBAN);
        assertEquals(2000.0, sender.getBalance());
        assertEquals(3000.0, recipient.getBalance());
    }
}
