import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class CreateAccountDataTest {

    @Test
    void testCreateAccount() {
        CreateAccountData createAccountData = new CreateAccountData();
        Assertions.assertDoesNotThrow(() -> createAccountData.createAccount("Tahura Tabassum", "tahura@example.com", "123-456-7890"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> createAccountData.createAccount("", "tahura@example.com", "123-456-7890"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> createAccountData.createAccount("Tahura Tabassum", "", "123-456-7890"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> createAccountData.createAccount("Tahura Tabassum", "tahura@example.com", ""));
        Assertions.assertThrows(IllegalArgumentException.class, () -> createAccountData.createAccount("", "", ""));
    }

    @Test
    void testGetAccount() {
        CreateAccountData createAccountData = new CreateAccountData();
        createAccountData.createAccount("Tahura Tabassum", "tahura@example.com", "123-456-7890");
        Optional<Account> account = createAccountData.getAccount("tahura@example.com");
        Assertions.assertTrue(account.isPresent());
        Assertions.assertEquals("Tahura Tabassum", account.get().getName());
        Assertions.assertEquals("tahura@example.com", account.get().getEmail());
        Assertions.assertEquals("123-456-7890", account.get().getPhoneNumber());
        Assertions.assertFalse(createAccountData.getAccount("nonexistent@example.com").isPresent());
    }
}
