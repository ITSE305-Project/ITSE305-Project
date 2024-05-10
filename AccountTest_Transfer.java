import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest_Transfer {

    @Test
    void testGetIBAN() {
        Account account = new Account("123456789", 1000.0);
        assertEquals("123456789", account.getIBAN());
    }

    @Test
    void testGetBalance() {
        Account account = new Account("123456789", 1000.0);
        assertEquals(1000.0, account.getBalance());
    }

    @Test
    void testSetBalance() {
        Account account = new Account("123456789", 1000.0);
        account.setBalance(1500.0);
        assertEquals(1500.0, account.getBalance());
    }
}
