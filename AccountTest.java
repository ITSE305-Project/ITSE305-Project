import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {
    @Test
    public void testAccount() {
        Account account = new Account("Tahura Tabassum", "tahura@example.com", "123-456-7890");

        assertEquals("Tahura Tabassum", account.getName());
        assertEquals("tahura@example.com", account.getEmail());
        assertEquals("123-456-7890", account.getPhoneNumber());
    }
}