import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TransferMoneyDataTest {

    @Test
    void testAccountExists() {
        TransferMoneyData data = new TransferMoneyData();
        assertTrue(data.accountExists("123123123"));
        assertFalse(data.accountExists("999999999")); // Non-existent account
    }

    @Test
    void testGetAccount() {
        TransferMoneyData data = new TransferMoneyData();
        TransferAccount account = data.getAccount("112233123");
        assertNotNull(account);
        assertEquals("112233123", account.getIBAN());
        assertEquals(3000.0, account.getBalance());
    }
}
