import org.junit.Test;

public class CreateAccountBusinessTest {
    @Test
    public void testCreateAccount() throws Exception {
        CreateAccountData createAccountData = new CreateAccountData();
        CreateAccountBusiness createAccountBusiness = new CreateAccountBusiness(createAccountData);

        createAccountBusiness.createAccount("Tahura Tabassum", "tahura@example.com", "123-456-7890");

        // You could add additional tests here to verify that the account was created correctly
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateAccountInvalidName() throws Exception {
        CreateAccountData createAccountData = new CreateAccountData();
        CreateAccountBusiness createAccountBusiness = new CreateAccountBusiness(createAccountData);

        createAccountBusiness.createAccount(null, "tahura@example.com","123-456-7890");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateAccountInvalidEmail() throws Exception {
        CreateAccountData createAccountData = new CreateAccountData();
        CreateAccountBusiness createAccountBusiness = new CreateAccountBusiness(createAccountData);

        createAccountBusiness.createAccount("Tahura Tabassum", "tahuraexample.com", "123-456-7890");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateAccountInvalidPhoneNumber() throws Exception {
        CreateAccountData createAccountData = new CreateAccountData();
        CreateAccountBusiness createAccountBusiness = new CreateAccountBusiness(createAccountData);

        createAccountBusiness.createAccount("Tahura Tabassum", "tahura@example.com", "123-456");
    }
}